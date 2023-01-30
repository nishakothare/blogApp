package com.UserBlogApp.repositoeies;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserBlogApp.entities.User;



public interface UserRepo extends JpaRepository<User,Integer>{

}
