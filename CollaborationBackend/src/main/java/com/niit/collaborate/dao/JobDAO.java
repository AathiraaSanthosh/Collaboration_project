package com.niit.collaborate.dao;

import java.util.List;

import com.niit.collaborate.model.Job;

public interface JobDAO {
	
	void addJob(Job job);
	List<Job> getAllJobs();
	Job getJob(int jobId);

}
