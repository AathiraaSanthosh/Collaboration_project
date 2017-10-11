package com.niit.collaborate.model;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table
public class BlogComment
{

	@Id
	private int ID;
	
	private int BlogID;
	
	private String Comment1;
	
	private int UserID;
	
	private String username;
	
	private Date createDate;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBlogID() {
		return BlogID;
	}

	public void setBlogID(int blogID) {
		BlogID = blogID;
	}

	public String getComment1() {
		return Comment1;
	}

	public void setComment1(String comment1) {
		Comment1 = comment1;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
	
	
}