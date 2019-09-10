package com.example.sba.controller;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sba.model.Mentor;
import com.example.sba.model.UserLogin;
import com.example.sba.service.MentorService;

@Controller
public class MentorControllerImpl implements MentorController{
	
	@Autowired
	MentorService mentorService;

	@RequestMapping(value = "/mentorLogin", method = RequestMethod.GET)
	public String mentorLogin(ModelMap model) throws SQLException {
		UserLogin userlogin=new UserLogin();
		model.addAttribute("ul",userlogin);
		return "mentorLogin";

	}
	
	@RequestMapping(value = "/mentorRegister", method = RequestMethod.GET)
	public String userRegistration(ModelMap model) throws SQLException {
		Mentor mentor=new Mentor();
		model.addAttribute("ul",mentor);
		return "mentorRegistration";

	}
	
	@RequestMapping(value = "/mentorregister", method = RequestMethod.POST) 
	public String registerUser(@Valid Mentor mentor, BindingResult result, Model model, HttpSession session) throws SQLException {  
		Random r=new Random();
		int num = (r.nextInt(90000) + 10000);
		mentor.setId(BigInteger.valueOf(num));
		num=r.nextInt(9000)+1000;
		mentor.setRegCode(num);
		//java.util.Date d=new java.util.Date();
		//java.sql.Date date=new java.sql.Date(d.getTime());
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date : " + utilDate);

		java.sql.Timestamp sqlTimeStamp = convertJavaDateToSqlDate(utilDate);
		System.out.println("java.sql.Timestamp : " + sqlTimeStamp);
		mentor.setRegDatetime(sqlTimeStamp);
		System.out.println(sqlTimeStamp);
		System.out.println("inside post method....................."+mentor);
		if(mentorService.registerMentor(mentor))
			return "redirect:/mentorLogin";
		else
			return "redirect:/mentorRegister";

	}
	public static java.sql.Timestamp convertJavaDateToSqlDate(java.util.Date date)
	{
		return new java.sql.Timestamp(date.getTime());
	}
}
