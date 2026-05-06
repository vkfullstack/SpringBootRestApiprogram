# 🚀 User Management REST API (Spring Boot)

A simple and clean **CRUD REST API** built using **Spring Boot**, following layered architecture (Controller → Service → Repository).
This project demonstrates how to build scalable backend services with proper API design.

---

## 📌 Features

* ✅ Create User
* ✅ Get All Users
* ✅ Get User by ID
* ✅ Update User
* ✅ Delete User
* ✅ Proper HTTP Status Codes (200, 404, etc.)
* ✅ Layered Architecture (Controller, Service, Repository)

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL (or H2)
* Maven

---

## 📂 Project Structure

```
src/main/java/com/example/usermanagement
│
├── controller
│   └── UserController.java
│
├── service
│   ├── UserService.java
│   └── UserServiceImpl.java
│
├── repository
│   └── UserRepository.java
│
├── model
│   └── User.java
│
└── UserManagementApplication.java
```

---

## 🔗 API Endpoints

### 1️⃣ Create User

**POST** `/users`

📥 Request Body:

```json
{
  "name": "Vijay",
  "email": "vijay@gmail.com",
  "password": "12345"
}
```

📤 Response:

```
201 Created
```

---

### 2️⃣ Get All Users

**GET** `/users`

📤 Response:

```json
[
  {
    "id": 1,
    "name": "Vijay",
    "email": "vijay@gmail.com"
  }
]
```

---

### 3️⃣ Get User by ID

**GET** `/users/{id}`

📤 Response:

```json
{
  "id": 1,
  "name": "Vijay",
  "email": "vijay@gmail.com"
}
```

---

### 4️⃣ Update User

**PUT** `/user/{id}`

📥 Request Body:

```json
{
  "name": "Updated Name",
  "email": "updated@gmail.com",
  "password": "12345"
}
```

📤 Response:

```
200 OK
```

---

### 5️⃣ Delete User

**DELETE** `/user/{id}`

📤 Response:

```
200 OK
```

---

## 📸 Screenshots

### 🔹 Create User (Postman)

![Create User](https://github.com/vkfullstack/SpringBootRestApiprogram/blob/main/Screenshot%202026-05-04%20194905.png?raw=true)

### 🔹 Get Users

![Get Users](https://github.com/vkfullstack/SpringBootRestApiprogram/blob/main/Screenshot%202026-05-04%20194926.png?raw=true)

### 🔹 Update User

![Update User](https://github.com/vkfullstack/SpringBootRestApiprogram/blob/main/Screenshot%202026-05-04%20194937.png?raw=true)

### 🔹 Delete User

![Delete User](https://github.com/vkfullstack/SpringBootRestApiprogram/blob/main/Screenshot%202026-05-04%20194949.png?raw=true)

---



### 2️⃣ Open in IDE (IntelliJ / Eclipse / VS Code)

### 3️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Run the Application

```bash
mvn spring-boot:run
```

---

## 🧠 Learning Outcomes

* REST API design
* Spring Boot fundamentals
* CRUD operations with JPA
* Exception handling
* Clean architecture

---

## 📌 Future Improvements

* 🔐 Add Authentication (JWT)
* 📦 Use DTO for data transfer
* 🧪 Add Unit Testing
* 🌐 Deploy on cloud (AWS / Render)

---

## 👨‍💻 Author

**Vijay Khetre**
Aspiring Data Analyst & Java Developer

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!
