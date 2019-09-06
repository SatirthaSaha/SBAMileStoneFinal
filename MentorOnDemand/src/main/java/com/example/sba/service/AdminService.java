package com.example.sba.service;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

import com.example.sba.model.Mentor;
import com.example.sba.model.Technology;
import com.example.sba.model.User;

public interface AdminService {

	public List<Technology> getSkillList() throws SQLException;

	public List<User> getUserList() throws SQLException;

	public List<Mentor> getMentorList() throws SQLException;

	public Technology getTechDetails(BigInteger id);

	public void deleteUser(BigInteger id);

}
