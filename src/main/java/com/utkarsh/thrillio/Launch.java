package com.utkarsh.thrillio;

import java.sql.SQLException;
import java.util.List;

import com.utkarsh.thrillio.bgjobs.WebpageDownloaderTask;
import com.utkarsh.thrillio.entities.Bookmark;
import com.utkarsh.thrillio.entities.User;
import com.utkarsh.thrillio.managers.BookmarkManager;
import com.utkarsh.thrillio.managers.UserManager;

public class Launch {
	private static List<User> users;
	private static List<List<Bookmark>> bookmarks;

	private static void loadData() {
		System.out.println("1.Loadin data...");
		DataStore.loadData();

		users = UserManager.getInstance().getUser();
		bookmarks = BookmarkManager.getInstance().getBookmarks();

//		System.out.println("printing data...");
//		printUserData();
//		printBookmarkData();

	}

	
	private static void printUserData() {
		for (User user : users) {
			System.out.println(user);
		}

	}


	private static void printBookmarkData() {
		for (List<Bookmark> bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void start() throws SQLException {
		///System.out.println("\n2.Bookmarking...");
		for (User user : users) {
			View.browse(user, bookmarks);
		}
	}

	public static void main(String[] args) throws SQLException {
		loadData();
		start();
		//runDownLoaderJob();
	}

	private static void runDownLoaderJob() {
		WebpageDownloaderTask task = new WebpageDownloaderTask(true);
		(new Thread(task)).start();
		
	}

}
