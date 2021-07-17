package com.niit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/")
	public String display(ModelMap map)
	{
		map.addAttribute("books",productDAO.displayProduct());
		return "displaybooks";
	}

	@GetMapping("/add")
	public String add(ModelMap map)
	{
		map.addAttribute("book", new Product());
		return "addbook";
	}
	
	@PostMapping("/add")
	public String add1(@ModelAttribute("book") Product p)
	{
		productDAO.addProduct(p);
		return "redirect:/";
	}
}
