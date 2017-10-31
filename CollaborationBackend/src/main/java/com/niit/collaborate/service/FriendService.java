package com.niit.collaborate.service;

import java.util.List;

import com.niit.collaborate.model.Friend;
import com.niit.collaborate.model.User;

public interface FriendService {

	List<User> listOfSuggestedUsers(String username);

	void friendRequest(Friend friend);
	
	List<Friend> pendingRequests(String toId);
	
}
