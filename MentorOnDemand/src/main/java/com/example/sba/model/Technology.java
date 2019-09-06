package com.example.sba.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Technology")
public class Technology implements Serializable {
    


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
//link to MentorSkill.java
    
    
 //unique courses must have unique mid and folowing all the entity
   
    @Column(name = "technology_name")
    private String technology_name ;
    
	/*
	 * @Column(name = "toc") private String toc ;
	 */
    
    @Column(name = "fees")
    private Double fees ;
    
   
    @Column(name = "duration")
    private Double duration ;
    
   
	/*
	 * @Column(name = "prerequites") private String prerequites ;
	 */

    

	public String getTechnology_name() {
		return technology_name ;
	}


	public BigInteger getId() {
		return id;
	}


	public void setId(BigInteger id) {
		this.id = id;
	}


	public void setTechnology_name(String technology_name) {
		this.technology_name = technology_name;
	}

	/*
	 * public String getToc() { return toc; }
	 * 
	 * 
	 * public void setToc(String toc) { this.toc = toc; }
	 */

	public Double getFees() {
		return fees;
	}


	public void setFees(Double fees) {
		this.fees = fees;
	}


	public Double getDuration() {
		return duration;
	}


	public void setDuration(Double duration) {
		this.duration = duration;
	}


	/*
	 * public String getPrerequites() { return prerequites; }
	 * 
	 * 
	 * public void setPrerequites(String prerequites) { this.prerequites =
	 * prerequites; }
	 */

	public Technology(BigInteger id, String technology_name, Double fees, Double duration) {
		super();
		this.id = id;
		this.technology_name = technology_name;
		//this.toc = toc;
		this.fees = fees;
		this.duration = duration;
		//this.prerequites = prerequites;
	}


	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    


}
