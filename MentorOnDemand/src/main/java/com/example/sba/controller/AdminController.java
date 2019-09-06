package com.example.sba.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.example.sba.model.UserLogin;

public interface AdminController {
	public String userLogin(ModelMap model) throws SQLException;
	public String loginUser(@Valid UserLogin userlogin, BindingResult result, Model model, HttpSession session) throws SQLException;
}
