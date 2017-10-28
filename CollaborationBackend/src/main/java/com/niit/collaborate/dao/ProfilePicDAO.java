package com.niit.collaborate.dao;

import com.niit.collaborate.model.ProfilePicture;

public interface ProfilePicDAO {
	
	void uploadProfilePic(ProfilePicture profilePicture);
	
	ProfilePicture getProfilePic(String username);
}
