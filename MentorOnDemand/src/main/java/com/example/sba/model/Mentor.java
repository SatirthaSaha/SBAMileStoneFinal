package com.example.sba.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

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
    private Timestamp regDatetime ;

    @Column(name="reg_code")
    private int regCode;
    
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

	public Timestamp getRegDatetime() {
		return regDatetime;
	}

	public void setRegDatetime(Timestamp sqlTimeStamp) {
		this.regDatetime = sqlTimeStamp;
	}

	public int getRegCode() {
		return regCode;
	}

	public void setRegCode(int regCode) {
		this.regCode = regCode;
	}
	
	
	public void setId(BigInteger id) {
		this.id = id;
	}
	public Mentor(String username, String linkedinUrl, String password, Long contact, Timestamp regDatetime,
			int regCode) {
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
	@Override
	public String toString() {
		return "Mentor [id=" + id + ", username=" + username + ", linkedinUrl=" + linkedinUrl + ", password=" + password
				+ ", contact=" + contact + ", regDatetime=" + regDatetime + ", regCode=" + regCode + "]";
	}

    
   
	
	

	
}
