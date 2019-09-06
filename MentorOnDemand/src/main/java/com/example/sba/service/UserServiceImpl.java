package com.example.sba.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sba.dao.UserDao;
import com.example.sba.model.User;
import com.example.sba.model.UserLogin;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User loginUser(UserLogin userlogin) {
		// TODO Auto-generated method stub
		return userDao.findByEmail(userlogin.getEmail());
	}

	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		User user1=new User();
		System.out.println(user);
		user1=userDao.save(user);
		if(user1!=null) {
			System.out.println(user1);
			return true;
		}
		else
			return false;
	}

	@Override
	public User getUserDetails(BigInteger id) {
		// TODO Auto-generated method stub
		return userDao.getOne(id);
	}

}
