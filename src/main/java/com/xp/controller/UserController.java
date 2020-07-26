package com.xp.controller;

import com.xp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//	@Autowired
//	private UserService userService;

	@Autowired
	private UserService userService;

	@RequestMapping("/insertUser")
	public Integer insertUser(String name, Integer age) {
		return userService.insertUser(name, age);
	}


//	@RequestMapping("/insertUser1")
//	public Integer insertUser(String name, Integer age) {
//		return 1;
//	}

	@RequestMapping("/test")
	public Integer test() {
		return 1;
	}

}
