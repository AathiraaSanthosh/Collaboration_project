package com.niit.collaborate.dao;

import java.util.List;

import com.niit.collaborate.model.BlogPost;

public interface BlogPostDAO {
	
	void addBlogPost(BlogPost blogPost);
	List<BlogPost> getBlogs(int approved);
	BlogPost getBlogById(int id);

}
