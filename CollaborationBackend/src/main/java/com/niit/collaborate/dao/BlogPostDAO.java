package com.niit.collaborate.dao;

import java.util.List;

import com.niit.collaborate.model.BlogComment;
import com.niit.collaborate.model.BlogPost;

public interface BlogPostDAO {
	
	void addBlogPost(BlogPost blogPost);
	List<BlogPost> getBlogs(int approved);
	BlogPost getBlogById(int id);
	void updateBlogPost(BlogPost blogPost);
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getBlogComments(int blogPostId);
    List<BlogPost> getNotification(String username);
}
