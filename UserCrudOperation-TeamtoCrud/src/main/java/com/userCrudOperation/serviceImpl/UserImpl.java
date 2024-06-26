package com.userCrudOperation.serviceImpl;

import java.util.List;
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

	@Override
<<<<<<< HEAD
	public void updateData(User u, int id) {
		ur.save(u);
		
=======
	public void deleteById(int id) {
		Optional<User> ops=ur.findById(id);
		if(ops.isPresent())
		{
			ops.get();
			ur.deleteById(id);
		}
	}
		
	public void postAllData(User user) {
	
		ur.save(user);
	}

	@Override
	public List<User> getAllData() {
		// TODO Auto-generated method stub
		return ur.findAll();
>>>>>>> branch 'main' of https://github.com/vishalchothe/Crud-Operations.git
	}

}
