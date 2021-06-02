package com.xworkz.xworkzapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "insta_table")
@NamedQuery(name="getallrecorde",query="from InstagramDTO")
@NamedQuery(name="getbyid",query="select userName from InstagramDTO where instaId=:Id")
@NamedQuery(name="getMaxFollowers",query="select max(noOfFollowers) from InstagramDTO")
@NamedQuery(name="getMinFollowers",query="select min(noOfFollowers) from InstagramDTO")
@NamedQuery(name="getCountAllRecords",query="select count(instaId) from InstagramDTO")
@NamedQuery(name="getSumOfUserFollowers",query="select sum(noOfFollowers) from InstagramDTO")

public class InstagramDTO {

    @Column(name = "INSTA_ID")
	@Id                // this annotation is used for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this annotation is used for auto increment
	private int instaId;
	
	@Column(name = "USENAME")
	private String userName;
	
	@Column(name = "PASSWORD")
    private String password;
	
	@Column(name = "TYPE")
    private String type;
	
	@Column(name = "IS_ACTIVE")
	private boolean isActive;
	
	@Column(name = "NO_OF_FOLLOWERS")
	private int noOfFollowers;
	
	public InstagramDTO() {
		System.out.println("default constructor");
	}
	
	public InstagramDTO(String userName, String password, String type, boolean isActive, int noOfFollowers) {
		super();
		
		this.userName = userName;
		this.password = password;
		this.type = type;
		this.isActive = isActive;
		this.noOfFollowers = noOfFollowers;
	}

	public int getInstaId() {
		return instaId;
	}

	public void setInstaId(int instaId) {
		this.instaId = instaId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getNoOfFollowers() {
		return noOfFollowers;
	}

	public void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}

	@Override
	public String toString() {
		return "InstagramDTO [instaId=" + instaId + ", userName=" + userName + ", password=" + password + ", type="
				+ type + ", isActive=" + isActive + ", noOfFollowers=" + noOfFollowers + "]";
	}
	
	
	
	
}
