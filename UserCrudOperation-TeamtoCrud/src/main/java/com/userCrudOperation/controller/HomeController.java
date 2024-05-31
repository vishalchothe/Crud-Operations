package com.userCrudOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userCrudOperation.model.User;
import com.userCrudOperation.service.UserServiceI;

@RestController
public class HomeController {

	@Autowired
	UserServiceI si;

	@GetMapping("/getone/{id}")
	public User getOne(@PathVariable int id) {

		User ui = si.getOne(id);
		return ui;
	}
	
	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody User u, @PathVariable("id") int id ) {
		si.updateData(u,id);
		return "UpdateData Successfully!..";
		
	}
}
