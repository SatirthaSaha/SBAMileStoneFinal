package com.example.sba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sba.dao.MentorDao;
import com.example.sba.model.Mentor;

@Service
public class MentorServiceImpl implements MentorService {
	
	@Autowired
	MentorDao mentorDao;

	@Override
	public boolean registerMentor(Mentor mentor) {
		// TODO Auto-generated method stub
		Mentor mentor1=new Mentor();
		System.out.println(mentor);
		mentor1=mentorDao.save(mentor);
		System.out.println(mentor1);
		if(mentor1!=null) {
			System.out.println(mentor1);
			return true;
		}
		else
			return false;
	}

}
