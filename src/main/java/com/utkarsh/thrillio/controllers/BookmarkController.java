package com.utkarsh.thrillio.controllers;

import java.sql.SQLException;

import com.utkarsh.thrillio.constants.KidFriendlyStatus;
import com.utkarsh.thrillio.entities.Bookmark;
import com.utkarsh.thrillio.entities.User;
import com.utkarsh.thrillio.managers.BookmarkManager;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();

	private BookmarkController() {
	}

	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
     BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
	}

	public void setKidFriendlyStatus(User user, KidFriendlyStatus kidFriendlyStatus ,Bookmark bookmark) throws SQLException{
		BookmarkManager.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus,bookmark);
	}

	public void share(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().share(user,bookmark);
		
	}
}
