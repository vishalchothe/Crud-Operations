package com.userCrudOperation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userCrudOperation.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}