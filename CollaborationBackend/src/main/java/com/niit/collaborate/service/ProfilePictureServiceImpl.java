package com.niit.collaborate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.ProfilePicDAO;
import com.niit.collaborate.model.ProfilePicture;

@Service
public class ProfilePictureServiceImpl implements ProfilePictureService {

	@Autowired
	private ProfilePicDAO profilePictureDAO;
	
	public void uploadProfilePicture(ProfilePicture profilePicture) {
		profilePictureDAO.uploadProfilePic(profilePicture);
	}

	public ProfilePicture getProfilePicture(String username) {
		
		return profilePictureDAO.getProfilePic(username);
	}

}
