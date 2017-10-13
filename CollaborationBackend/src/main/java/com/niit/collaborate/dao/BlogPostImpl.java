package com.niit.collaborate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collaborate.model.BlogPost;

@Repository
@Transactional
public class BlogPostImpl implements BlogPostDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addBlogPost(BlogPost blogPost) {
		Session session=sessionFactory.getCurrentSession();
		session.save(blogPost);
	}

	public List<BlogPost> getBlogs(int approved) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from blogpost where approved="+approved);
		return query.list();
	}

	public BlogPost getBlogById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public BlogPost getBlogById(int id) {
		Session session = sessionFactory.getCurrentSession();
		 BlogPost blogPost =(BlogPost)Session.get(BlogPost.class ,id);  //select * from blogpost where id=?
		return blogPost;
	}*/

}
