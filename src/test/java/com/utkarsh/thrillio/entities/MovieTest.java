package com.utkarsh.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utkarsh.thrillio.constants.MovieGenre;
import com.utkarsh.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIskidFriendlyEligible() {
		// Test 1
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" },new String[] 
						{ "Orson Welles" }, MovieGenre.HORROR,8.5);
		
		boolean iskidFriendlyEligible = movie.isKidFriendlyEligible();
		
		assertFalse("For Horror Genre - isiskidFriendlyEligible should return false",iskidFriendlyEligible);
		
		// Test 2:
		
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" },new String[] 
						{ "Orson Welles" }, MovieGenre.THRILLERS,8.5);
		
		iskidFriendlyEligible = movie.isKidFriendlyEligible();
		
		assertFalse("For Thrillers Genre - isiskidFriendlyEligible should return false",iskidFriendlyEligible);
	}

}
