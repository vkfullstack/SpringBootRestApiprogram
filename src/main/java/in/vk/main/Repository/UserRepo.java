package in.vk.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vk.main.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
