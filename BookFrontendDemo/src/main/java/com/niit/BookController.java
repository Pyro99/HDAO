package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

	@RequestMapping("/add")
	public String add()
	{
		return "addbook";
	}
	@RequestMapping("/")
	public String display()
	{
		return "displaybooks";
	}
}
