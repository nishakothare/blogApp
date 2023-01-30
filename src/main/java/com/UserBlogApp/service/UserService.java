package com.UserBlogApp.service;

import java.util.List;

import com.UserBlogApp.payload.UserDto;




public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);

}
