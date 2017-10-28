package com.niit.collaborate.service;

import com.niit.collaborate.model.ProfilePicture;

public interface ProfilePictureService {

	void uploadProfilePicture(ProfilePicture profilePicture);
	
	ProfilePicture getProfilePicture(String username);
}
