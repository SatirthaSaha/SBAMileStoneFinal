package com.example.sba.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sba.model.UserLogin;

@Controller
public class MentorControllerImpl implements MentorController{

	@RequestMapping(value = "/mentorLogin", method = RequestMethod.GET)
	public String mentorLogin(ModelMap model) throws SQLException {
		UserLogin userlogin=new UserLogin();
		model.addAttribute("ul",userlogin);
		return "mentorLogin";

	}
}
