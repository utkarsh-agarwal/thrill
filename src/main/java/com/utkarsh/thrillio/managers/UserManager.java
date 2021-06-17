package com.utkarsh.thrillio.managers;

import com.utkarsh.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();

	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	}

	public User CreateUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
          User user = new User();
          user.setId(id);
          user.setEmail(email);
          user.setPassword(password);
          user.setFirstName(firstName);
          user.setLastName(lastName);
          user.setGender(gender);
          user.setUserType(userType);
		return user;
          
	}
}
