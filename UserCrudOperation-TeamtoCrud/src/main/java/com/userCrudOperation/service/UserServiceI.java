package com.userCrudOperation.service;

import com.userCrudOperation.model.User;

public interface UserServiceI  {

	void postAllData(User user);
	User getOne(int id);

}
