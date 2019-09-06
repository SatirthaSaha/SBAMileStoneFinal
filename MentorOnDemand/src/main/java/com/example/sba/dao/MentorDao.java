package com.example.sba.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sba.model.Mentor;

public interface MentorDao extends JpaRepository<Mentor, BigInteger>{

}
