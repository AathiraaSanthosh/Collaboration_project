package com.niit.collaborate.dao;

import java.util.List;

import com.niit.collaborate.model.Job;

public interface JobDAO 
{

public boolean createJob(Job job);
	
	public boolean approveJob(Job job);
	
	public boolean deleteJob(int jobid);
	
	public boolean editJob(int jobid);
	
	public Job getJob(int jobid);
	
	public List<Job> getJobs();
}
