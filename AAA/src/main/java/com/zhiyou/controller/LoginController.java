package com.zhiyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.User;
import com.zhiyou.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("login")
	public String login(String username,String password,Model model) {
		User user = loginService.login(username,password);
		model.addAttribute("user",user);
		return "success";
	}
	
	
	
}
