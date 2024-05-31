package com.userCrudOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.userCrudOperation.model.User;
import com.userCrudOperation.service.UserServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HomeController {

	@Autowired
	UserServiceI si;

	@GetMapping("/getone/{id}")
	public User getOne(@PathVariable int id) {

		User ui = si.getOne(id);
		return ui;
	}

	@PostMapping("/post")
	public String postMethodName(@RequestBody User user) {
		si.postAllData(user);
		return "Inserted data SuccessFully.!!";
	}

}
