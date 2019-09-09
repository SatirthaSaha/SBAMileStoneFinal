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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.sba.model.User;
import com.example.sba.model.UserLogin;
import com.example.sba.service.UserService;
import com.example.sba.service.UserServiceImpl;



@Controller
public class UserControllerImpl {
	
	@Autowired 
	private UserService userService=new UserServiceImpl();

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin(ModelMap model) throws SQLException {
		UserLogin userlogin=new UserLogin();
		model.addAttribute("ul",userlogin);
		return "userLogin";

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String loginUser(@Valid UserLogin userlogin, BindingResult result, Model model, HttpSession session) throws SQLException { 
		System.out.println("inside post method"); 
		System.out.println("password"+userlogin.getPassword());
		User user=userService.loginUser(userlogin);
		System.out.println("inside login controller..................."+user);
		if(user!=null && user.getPassword().equals(userlogin.getPassword())) {	
			session.setAttribute("user", user);
			return	"userDetails";
		}
		else 
			return "redirect:/userLogin"; 

	}
	
	@RequestMapping(value = "/userRegister", method = RequestMethod.GET)
	public String userRegistration(ModelMap model) throws SQLException {
		User user=new User();
		model.addAttribute("ul",user);
		return "userRegistration";

	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST) 
	public String registerUser(@Valid User user, BindingResult result, Model model, HttpSession session) throws SQLException {  
		Random r=new Random();
		int num = (r.nextInt(90000) + 10000);
		user.setId(BigInteger.valueOf(num));
		num=r.nextInt(9000)+1000;
		user.setRegCode(num);
		//java.util.Date d=new java.util.Date();
		//java.sql.Date date=new java.sql.Date(d.getTime());
		java.util.Date utilDate = new java.util.Date();
		System.out.println("java.util.Date : " + utilDate);

		java.sql.Timestamp sqlTimeStamp = convertJavaDateToSqlDate(utilDate);
		System.out.println("java.sql.Timestamp : " + sqlTimeStamp);
		user.setRegDatetime(sqlTimeStamp);
		System.out.println(sqlTimeStamp);
		user.setActive(1);
		System.out.println("inside post method....................."+user);
		if(userService.registerUser(user))
			return "redirect:/userLogin";
		else
			return "redirect:/userRegister";

	}
	
	public static java.sql.Timestamp convertJavaDateToSqlDate(java.util.Date date)
	{
		return new java.sql.Timestamp(date.getTime());
	}
	
	 @RequestMapping(path="/activate/{id}",method=RequestMethod.GET)
	  public  String editUser(@PathVariable ("id") BigInteger id) {
	User user=userService.getUserDetails(id);
	if(user.getActive()==0)
	 user.setActive(1);
	else
	 user.setActive(0);
	userService.registerUser(user);
	return "redirect:/userList";
	  }
	 
	 @RequestMapping(value = "/logout", method = RequestMethod.GET)
		public String logout(ModelMap model) throws SQLException {
			return "redirect:/adminLogin";

		}
	 
	}
	
