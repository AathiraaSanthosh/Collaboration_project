package com.niit.collaborate.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "blogcomment")
public class BlogComment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String commentText;
	@ManyToOne
	private User commentedBy; // FK commented by_username
	private Date commentedOn;

	@ManyToOne
	private BlogPost blogPost; // Fk blogpost_id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public User getCommentedBy() {
		return commentedBy;
	}

	public void setCommentedBy(User commentedBy) {
		this.commentedBy = commentedBy;
	}

	public Date getCommentedOn() {
		return commentedOn;
	}

	public void setCommentedOn(Date commentedOn) {
		this.commentedOn = commentedOn;
	}

	public BlogPost getBlogPost() {
		return blogPost;
	}

	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}

}
