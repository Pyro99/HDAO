package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String m1()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String m2()
	{
		return "register";
	}
}
