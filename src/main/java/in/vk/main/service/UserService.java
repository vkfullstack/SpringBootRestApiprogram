package in.vk.main.service;

import java.util.List;
import java.util.Optional;

import in.vk.main.entity.User;

public interface UserService {
public User createuser(User user);
public List<User> getAlluser();
public Optional<User> getuserdetails(int id);
public User updateuser(int id ,User user);
public void delteid(int id);
}
