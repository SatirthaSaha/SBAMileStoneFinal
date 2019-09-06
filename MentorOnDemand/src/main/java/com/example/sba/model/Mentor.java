package com.example.sba.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Mentor")
public class Mentor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
    private BigInteger id;
   
    @Column(name="username")
    private String username;

    @Column(name="linkedin_url")
    private String linkedinUrl;

    @Column(name="password")
    private String password;
    
    @Column(name="contact")
    private Long contact;

    @Column(name="reg_datetime")
    private Date regDatetime ;

    @Column(name="reg_code")
    private String regCode;
    
    public BigInteger getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Date getRegDatetime() {
		return regDatetime;
	}

	public void setRegDatetime(Date regDatetime) {
		this.regDatetime = regDatetime;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public Mentor(String username, String linkedinUrl, String password, Long contact, Date regDatetime,
			String regCode) {
		super();
		this.username = username;
		this.linkedinUrl = linkedinUrl;
		this.password = password;
		this.contact = contact;
		this.regDatetime = regDatetime;
		this.regCode = regCode;
	}
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}

    
   
	
	

	
}
