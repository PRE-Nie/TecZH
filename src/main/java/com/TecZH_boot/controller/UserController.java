package com.TecZH_boot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.TecZH_boot.model.User;
import com.TecZH_boot.service.UserService;

import utils.BaseResult;
import utils.ListResult;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Long id) {
		userService.delete(id);
		return "success";
		
	}
	

	@RequestMapping("userList")
	@ResponseBody
	public ListResult userList() { //得到所有用户信息
		return  userService.selectAll();
		
	}
	
	@RequestMapping("insert")
	@ResponseBody
	public BaseResult insertUser(User user) {
		return userService.insert(user);
	}
	
	@GetMapping("tologin")
	public String login(Model model) {
		model.addAttribute("name", "jack");
		model.addAttribute("age", 20);
		model.addAttribute("info", "我是一个爱学习的好青年");
		System.out.println(model);
		return "/hello";
	}
	
	
	
}
