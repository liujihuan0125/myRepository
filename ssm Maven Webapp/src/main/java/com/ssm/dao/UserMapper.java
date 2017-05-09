package com.ssm.dao;


import org.apache.ibatis.annotations.Param;

import com.ssm.model.User;
public interface UserMapper {
	
	public User findUserById(@Param(value = "id") String id);

	public int insert(User user);
}
