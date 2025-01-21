package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.servcie.UserServcie;

@Controller
public class UserController {
	
	private final UserServcie userServcie;
	
     public UserController(UserServcie userServcie) {
    	 this.userServcie = userServcie;
    	 
     }
     
     //create endpoitns
     @GetMapping("/users")
     public String Users(Model model) {
    	 
    	 model.addAttribute("users",userServcie.ListOfUsers());
    	 
		return "users";
    	 
    	 
    	 
     }
     
}
