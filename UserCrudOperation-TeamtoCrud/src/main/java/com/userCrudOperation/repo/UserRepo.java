package com.userCrudOperation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userCrudOperation.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
