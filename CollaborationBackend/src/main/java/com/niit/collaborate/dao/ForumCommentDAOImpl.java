package com.niit.collaborate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.collaborate.model.ForumComment;

@Repository("forumCommentDAO")
public class ForumCommentDAOImpl implements ForumCommentDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	public ForumCommentDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean createForumComment(ForumComment forumComment) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(forumComment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised" +e);
			return false;
		}
	}

	@Transactional
	public boolean approveForumComment(ForumComment forumComment) {
		try {
			
			sessionFactory.getCurrentSession().saveOrUpdate(forumComment);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("exception arised:" +e);
			return false;
		}

	}

	@Transactional
	public boolean deleteForumComment(int ID) {
		try {
			Session session=sessionFactory.openSession();
			ForumComment forumComment=(ForumComment)session.get(ForumComment.class,ID);
			session.delete(forumComment);
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

	public boolean editForumComment(int ID) {
		// TODO Auto-generated method stub
		return false;
	}

	public ForumComment getForumComment(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ForumComment> getForumComments() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from ForumComment where status = 'A'");
		List<ForumComment> listForumComment= query.list();
		session.close();
		return listForumComment;
	}

}
