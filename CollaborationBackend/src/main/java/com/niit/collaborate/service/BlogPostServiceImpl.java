package com.niit.collaborate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.BlogPostDAO;
import com.niit.collaborate.model.BlogComment;
import com.niit.collaborate.model.BlogPost;

@Service
public class BlogPostServiceImpl implements BlogPostService {

	@Autowired
	private BlogPostDAO blogPostDAO;
	
	public void addBlogPost(BlogPost blogPost) {
		blogPostDAO.addBlogPost(blogPost);
	}

	public List<BlogPost> getBlogs(int approved) {
		
		return blogPostDAO.getBlogs(approved);
	}

	public BlogPost getBlogById(int id) {
		
		return blogPostDAO.getBlogById(id);
	}

	public void updateBlogPost(BlogPost blogPost) {
		blogPostDAO.addBlogPost(blogPost);
		
	}

	public void addBlogComment(BlogComment blogComment) {
		blogPostDAO.addBlogComment(blogComment);
	}

	public List<BlogComment> getBlogComments(int blogPostId) {
		return  blogPostDAO.getBlogComments(blogPostId);
	}
	public List<BlogPost> getNotification(String username) {
		return blogPostDAO.getNotification(username);
	}
}
