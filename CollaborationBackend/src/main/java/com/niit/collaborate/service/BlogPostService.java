package com.niit.collaborate.service;

import java.util.List;

import com.niit.collaborate.model.BlogComment;
import com.niit.collaborate.model.BlogPost;

public interface BlogPostService {

	void addBlogPost(BlogPost blogPost);
	
	List<BlogPost> getBlogs(int approved);
	
	BlogPost getBlogById(int id);

	void updateBlogPost(BlogPost blogPost);
	
	void addBlogComment(BlogComment blogComment);

	List<BlogComment> getBlogComments(int blogPostId);
}
