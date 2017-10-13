package com.niit.collaborate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.BlogPostDAO;
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
		// TODO Auto-generated method stub
		return blogPostDAO.getBlogById(id);
	}

}

