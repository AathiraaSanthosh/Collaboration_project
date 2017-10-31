package com.niit.collaborate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.collaborate.dao.FriendDAO;
import com.niit.collaborate.model.Friend;
import com.niit.collaborate.model.User;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendDAO friendDAO;
	public List<User> listOfSuggestedUsers(String username) {
		return friendDAO.listOfSuggestedUsers(username);
	}
	public void friendRequest(Friend friend) {
		
		friendDAO.friendRequest(friend);
	}
	public List<Friend> pendingRequests(String toId) {
		return friendDAO.pendingRequests(toId);
	}

}
