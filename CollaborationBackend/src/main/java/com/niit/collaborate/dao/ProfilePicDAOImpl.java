package com.niit.collaborate.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collaborate.model.ProfilePicture;

@Repository
@Transactional
public class ProfilePicDAOImpl implements ProfilePicDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void uploadProfilePic(ProfilePicture profilePicture) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(profilePicture); //insert or update

	}

	public ProfilePicture getProfilePic(String username) {
		Session session=sessionFactory.getCurrentSession();
		ProfilePicture profilePic=(ProfilePicture)session.get(ProfilePicture.class, username); //select * from profilepic where username=?
		return profilePic;
	}

}
