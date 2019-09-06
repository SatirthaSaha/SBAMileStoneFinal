package com.example.sba.controller;

import java.math.BigInteger;
import java.sql.SQLException;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.sba.model.UserLogin;
import com.example.sba.service.AdminService;
import com.example.sba.service.AdminServiceImpl;

@Controller
public class AdminControllerImpl {

	
	 @Autowired 
	 AdminService adminService= new AdminServiceImpl();
	
	
	@RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
	public String userLogin(ModelMap model) throws SQLException {
		UserLogin userlogin=new UserLogin();
		model.addAttribute("ul",userlogin);
		return "adminLogin";

	}
	
	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST) 
	public String loginUser(@Valid UserLogin userlogin, BindingResult result, Model model, HttpSession session) throws SQLException { 
		System.out.println("inside post method"); 
		System.out.println("password"+userlogin.getPassword());
		//User user=adminService.loginUser(userlogin);
		//System.out.println("inside login controller..................."+user);
		if(userlogin.getEmail().equals("admin")&& userlogin.getPassword().equals("admin")) {
			return	"redirect:/skillList";
		}
		else 
			return "redirect:/adminLogin"; 

	}
	
	@RequestMapping(value="/skillList")
	public ModelAndView getSkillList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("manageSkills");
		mv.addObject("skillList",adminService.getSkillList());
		return mv;
	}
	
	@RequestMapping(value="/userList")
	public ModelAndView getUserList() throws Exception {
		System.out.println("+++++++++++++++++++++++++++++");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("manageUsers");
		System.out.println(adminService.getUserList());
		mv.addObject("userList",adminService.getUserList());
		return mv;
	}

	@RequestMapping(value="/mentorList")
	public ModelAndView getMentorList() throws Exception {
		System.out.println("+++++++++++++++++++++++++++++");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("manageMentors");
		mv.addObject("mentorList",adminService.getMentorList());
		return mv;
	}
	
	@RequestMapping(value = "/techDetails/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView TechDetails(@PathVariable("id") BigInteger id, ModelMap model)throws SQLException {
		System.out.println("inside post method");
		//System.out.println(companyService.editCompany(company_code));
		ModelAndView mv=new ModelAndView();
		mv.setViewName("TechnologyDetails");
		model.addAttribute("technology",adminService.getTechDetails(id));
		return mv;
	}
	
	@RequestMapping(value = "/userRemove/{id}")
	@ResponseBody
	public ModelAndView TechRemove(@PathVariable("id") BigInteger id, ModelMap model)throws SQLException {
		System.out.println("inside post method");
		//System.out.println(companyService.editCompany(company_code));
		adminService.deleteUser(id);
		return new ModelAndView("redirect:/userList");
	}
}
