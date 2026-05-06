package in.vk.main.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.vk.main.entity.User;
import in.vk.main.service.UserService;

@RestController
public class MyController {
	private UserService userService;
	
	public MyController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/user")
public User addUserDetails( @RequestBody  User user) {
	return userService.createuser(user);
}
	@GetMapping("/user")
	public List<User>getAlluser(){
		return userService.getAlluser();
	}
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getdetials(@PathVariable int id){
		 User getuser = userService.getuserdetails(id).orElse(null);
		 if(getuser !=null) {
			 return ResponseEntity.ok().body(getuser);
		 }
		 else {
			 return ResponseEntity.notFound().build();
		 }
		 
	
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> updatedetails(
	        @PathVariable int id,
	        @RequestBody User user) {

	    User updateuser = userService.updateuser(id, user);

	    if (updateuser != null) {
	        return ResponseEntity.ok(updateuser);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteuser(@PathVariable int id){
		userService.delteid(id);
		return ResponseEntity.noContent().build();
	}
}
