package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.User;
import com.app.service.ServiceInt;

@Controller
@RequestMapping("/user")
public class UserCon
{
	@Autowired
	private ServiceInt services;
	
	@GetMapping("/adduser")
	public String showUser(User u) 
	{
		System.out.println("In Show user");
		return "/user/adduser";
	}
	@GetMapping("/list")
	public void showUser(Model map)
	{
		System.out.println("In Showuser");
		map.addAttribute("status", services.listUser());
	}
	
	@PostMapping("/adduser")
	public String RegisterUser(User u, RedirectAttributes flashmap)
	{
		System.out.println("In Add User"+u);
		flashmap.addFlashAttribute("status", services.RegisterUser(u));
		return "redirect:/user/list";
	}
	
}


