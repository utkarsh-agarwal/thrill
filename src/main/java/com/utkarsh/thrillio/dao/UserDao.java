package com.utkarsh.thrillio.dao;

import java.util.List;

import com.utkarsh.thrillio.DataStore;
import com.utkarsh.thrillio.entities.User;

public class UserDao {
	public List<User> getUser() {
		return DataStore.getUsers();
	}
}
 