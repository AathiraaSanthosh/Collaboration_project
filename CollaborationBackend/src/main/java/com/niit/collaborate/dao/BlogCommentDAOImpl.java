package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaborate.model.BlogComment;

@Repository("blogCommentDAO")
public class BlogCommentDAOImpl implements BlogCommentDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public BlogCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean createBlogComment(BlogComment blogComment) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(blogComment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised" +e);
			return false;
		}
	}

	@Transactional
	public boolean approveBlogComment(BlogComment blogComment) {
		try {
		
			sessionFactory.getCurrentSession().saveOrUpdate(blogComment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised:" +e);
			return false;
		}

	}

	@Transactional
	public boolean deleteBlogComment(int ID) {
		try {
			Session session=sessionFactory.openSession();
			BlogComment blogComment=(BlogComment)session.get(BlogComment.class,ID);
			session.delete(blogComment);
			session.flush();
			session.close();
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised" +e);
			return false;
		}
	}

	public boolean editBlogComment(int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	public BlogComment getBlogComment(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<BlogComment> getBlogComments() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from BlogComment where status = 'A'");
		List<BlogComment> listBlogComment= query.list();
		session.close();
		return listBlogComment;
	}

}
