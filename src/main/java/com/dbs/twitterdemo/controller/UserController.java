package com.dbs.twitterdemo.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbs.twitterdemo.model.Tweets;
import com.dbs.twitterdemo.model.User;
import com.dbs.twitterdemo.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController 
{
	@Autowired
    private UserService userService;
	@GetMapping("/UserRegister")
  public String showRegistration(Model model)
  {
		model.addAttribute("user", new User());
		return "UserRegister";
  }
	 @PostMapping("/UserRegister")
	    public String registerUser( @Valid @ModelAttribute("user") User user,
	                                BindingResult bindingResult) throws IOException {
	        if(bindingResult.hasErrors())
	        {
	            System.out.println("Error "+bindingResult.toString());
	            return "UserRegistration";
	            //throw  new ArithmeticException("Exception occurred");
	        }
	        else
	        {
	        	Tweets t = new Tweets();
	        	t.setMessage("Article 370");
	        	
	        	user.postTweet(t);
	        	
	        	System.out.println("Saved user records");
	        this.userService.saveUser(user);
	        return "dashboard";
	        }
	    }
}
