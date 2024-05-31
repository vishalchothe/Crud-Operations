package com.userCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PutMapping;
=======
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> branch 'main' of https://github.com/vishalchothe/Crud-Operations.git
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
<<<<<<< HEAD
	
	@PutMapping("/updatedata/{id}")
	public String updateData(@RequestBody User u, @PathVariable("id") int id ) {
		si.updateData(u,id);
=======


	@DeleteMapping("DeleteById/{id}")
	public String DeleteByData(@PathVariable int id) {
		si.deleteById(id);
		return "Data Deleted Successfully";

	}
	@PostMapping("/post")
	public String postMethodName(@RequestBody User user) {
		si.postAllData(user);
		return "Inserted data SuccessFully.!!";
	}
	
	@GetMapping("/getdata")
	public List<User> getAllUser() {
>>>>>>> branch 'main' of https://github.com/vishalchothe/Crud-Operations.git
		
<<<<<<< HEAD
		return "UpdateData Successfully!..";
		
	}
=======
		List<User> list=si.getAllData();
		
		return list;
	}



>>>>>>> branch 'main' of https://github.com/vishalchothe/Crud-Operations.git
}
