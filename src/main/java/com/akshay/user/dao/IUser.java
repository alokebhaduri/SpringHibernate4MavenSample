package com.akshay.user.dao;

import com.akshay.user.model.User;

public interface IUser {
	void save(User user);
	void update(User user);
	void delete(User user);
	User findUserByEmailId(String id);
}
