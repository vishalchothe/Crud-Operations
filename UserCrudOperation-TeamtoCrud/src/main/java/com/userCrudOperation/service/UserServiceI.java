package com.userCrudOperation.service;

import java.util.List;

import com.userCrudOperation.model.User;

public interface UserServiceI  {

	void postAllData(User user);
	User getOne(int id);
	List<User> getAllData();

	void deleteById(int id);

	void updateData(User u, int id);

}
