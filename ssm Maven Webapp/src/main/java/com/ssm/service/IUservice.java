package com.ssm.service;

import java.util.List;

import com.ssm.model.User;

public interface IUservice {
	public User getUserById(String userId);

	public int insert(List<User> user);
}
