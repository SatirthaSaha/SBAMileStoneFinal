package com.example.sba.service;

import com.example.sba.model.User;
import com.example.sba.model.UserLogin;

public interface UserService {

	User loginUser(UserLogin userlogin);

	boolean registerUser(User user);

}
