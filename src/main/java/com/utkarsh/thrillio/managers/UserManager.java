package com.utkarsh.thrillio.managers;

import java.util.List;

import com.utkarsh.thrillio.constants.Gender;
import com.utkarsh.thrillio.dao.UserDao;
import com.utkarsh.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();
private static UserDao dao = new UserDao();
	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	}

	public User CreateUser(long id, String email, String password, String firstName, String lastName, Gender gender,
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
	
	public List<User> getUser() {
		return dao.getUser();
	}
}
