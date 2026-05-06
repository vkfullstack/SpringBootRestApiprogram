package in.vk.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.vk.main.Repository.UserRepo;
import in.vk.main.entity.User;
@Service
public class UserServiceImpl  implements UserService{

	private UserRepo userRepo;

  public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}


	@Override
	public User createuser(User user) {
	
		return userRepo.save(user);
	}


	@Override
	public List<User> getAlluser() {
	
		return userRepo.findAll();
	}


	@Override
	public Optional<User> getuserdetails(int id) {
		
		return userRepo.findById(id);
	}


	@Override
	public User updateuser(int id, User user) {
		
	 User newuser= userRepo.findById(id).orElse(null);
	 if(newuser !=null){
		return  userRepo.save(newuser);
		 
	 }
		 throw new RuntimeException("not found id :"+id);
	 
	
	 
		
	}


	@Override
	public void delteid(int id) {
		userRepo.deleteById(id);
		
	}
	

}
