package com.niit.collaborate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.JobDAO;
import com.niit.collaborate.model.Job;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDAO jobDAO;
	
	public void addJob(Job job) {
		jobDAO.addJob(job);

	}

	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return null;
	}

}
