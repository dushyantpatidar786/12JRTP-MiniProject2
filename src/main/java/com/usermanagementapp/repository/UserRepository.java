package com.usermanagementapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.usermanagementapp.entity.User;

public interface UserRepository extends JpaRepository<User, Serializable> {

	User findByEmail(String email);
}
