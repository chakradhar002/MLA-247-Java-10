package com.servcie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repo.UserRepo;

@Service
public class UserServcie {
	
	@Autowired
	private final UserRepo  userRepo;
	
	public UserServcie(UserRepo  userRepo) {
		
		this.userRepo = userRepo;
	}
	
	
	public List<User> ListOfUsers(){
		
	 return	userRepo.ListOfUsers();
	}
	

}
