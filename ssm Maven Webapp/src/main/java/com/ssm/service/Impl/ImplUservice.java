package com.ssm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.service.IUservice;

@Service("userService")
public class ImplUservice implements IUservice {

	
	@Resource
    private UserMapper userDao;
	
	@Override
	public User getUserById(String userId) {
		return userDao.findUserById(userId);
	}

	@Override
	public int insert(List<User> user) {
		
//		if (condition) {
//			
//		}
//		
		return 0;
	}

}
