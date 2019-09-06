package com.example.sba.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sba.model.Technology;

@Repository
public interface TechnologyDao extends JpaRepository<Technology, BigInteger>{

	
}
