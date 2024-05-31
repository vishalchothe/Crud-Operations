package com.userCrudOperation.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userCrudOperation.model.User;
import com.userCrudOperation.repo.UserRepo;
import com.userCrudOperation.service.UserServiceI;

@Service
public class UserImpl implements UserServiceI{
	@Autowired
	UserRepo ur;

	@Override
	public User getOne(int id) {
		Optional<User> op=ur.findById(id);
		if(op.isPresent())
		{
			User u=op.get();
			return u;
		}
		else
		{
		return null;
		}
	}

}
