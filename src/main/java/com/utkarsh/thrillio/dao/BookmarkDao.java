package com.utkarsh.thrillio.dao;

import java.util.List;

import com.utkarsh.thrillio.DataStore;
import com.utkarsh.thrillio.entities.Bookmark;
import com.utkarsh.thrillio.entities.UserBookmark;

public class BookmarkDao {
	public List<List<Bookmark>> getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);		
	}
} 
