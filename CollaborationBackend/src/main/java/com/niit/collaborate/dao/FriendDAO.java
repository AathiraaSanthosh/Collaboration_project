package com.niit.collaborate.dao;

import java.util.List;

import com.niit.collaborate.model.Friend;
import com.niit.collaborate.model.User;

public interface FriendDAO {
	
	List<User> listOfSuggestedUsers(String username);

	void friendRequest(Friend friend);

	List<Friend> pendingRequests(String toId);
}
