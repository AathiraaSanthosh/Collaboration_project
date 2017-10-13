package com.niit.collaborate.restcontroller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collaborate.dao.JobDAO;
import com.niit.collaborate.model.Job;

@Repository
@Transactional
public class JobDAOImpl implements JobDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addJob(Job job) {
		Session session = sessionFactory.getCurrentSession();
		session.save(job);
		
	}

	public List<Job> getAllJobs() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Job"); //select * from job
 		return query.list(); //list of all objects
	}
	
	

}
