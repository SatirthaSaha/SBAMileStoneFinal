package com.example.sba.service;

import java.math.BigInteger;

import com.example.sba.model.User;
import com.example.sba.model.UserLogin;

public interface UserService {

	User loginUser(UserLogin userlogin);

	boolean registerUser(User user);

	User getUserDetails(BigInteger id);

}
