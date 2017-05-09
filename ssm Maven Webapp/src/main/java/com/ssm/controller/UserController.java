package com.ssm.controller;


import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.spring;

import com.ssm.model.User;
import com.ssm.service.IUservice;

@Controller
@RequestMapping(value="/user")
public class UserController {

	private final static Logger logger = LoggerFactory.getLogger(UserController.class); 
	
	@Resource
	private IUservice userService;
	
	@RequestMapping(value="/finduser",method=RequestMethod.GET)
	public String findUser(Model model){
		 User u = userService.getUserById("1");
		 model.addAttribute("u",u);
		 try {
			 logger.info("查询["+u.getUserName()+"]用户成功");
			return "/admin";
		} catch (AuthenticationException e) {
			return "/login";
		}
	}
	
	public String insertUser(){
		List<User> user = null;
		int count = userService.insert(user);
		if (count > 0) {
			return "/index";
		}else{
			return "/login";
		}
	}
}
