package com.utkarsh.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utkarsh.thrillio.managers.BookmarkManager;

public class WebLinkTest {

	@Test
	public void testIsKidFriendlyEligible() {
		
		// Test 1: porn in url -- false
		
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming tiger, Part 2",
				"	http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
				"	http://www.javaworld.com");
		
		boolean iskidFriendlyEligible = webLink.isKidFriendlyEligible();
		
		assertFalse("For porn in url -  iskidFriendlyEligible() must return false", iskidFriendlyEligible);
		
		// Test 2: porn in title -- false
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
				"	http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"	http://www.javaworld.com");
		
		iskidFriendlyEligible = webLink.isKidFriendlyEligible();
		
		assertFalse("For porn in title - iskidFriendlyEligible() must return false", iskidFriendlyEligible);
		
		// Test 3: adult in host -- false
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
				"	http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"	http://www.adult.com");
		
		iskidFriendlyEligible = webLink.isKidFriendlyEligible();
		
		assertFalse("For adult in host - iskidFriendlyEligible() must return false", iskidFriendlyEligible);
		
		// Test 4: adult in url,but not in host part -- true
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming tiger, Part 2",
				"	http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",
				"	http://www.javaworld.com");
		
		iskidFriendlyEligible = webLink.isKidFriendlyEligible();
		
		assertTrue("For adult in url but bot in host part - iskidFriendlyEligible() must return true", iskidFriendlyEligible);
		
		// Test 5: adult in title only -- true
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2",
				"	http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"	http://www.javaworld.c");
		
		iskidFriendlyEligible = webLink.isKidFriendlyEligible();
		
		assertTrue("For adult in title - iskidFriendlyEligible() must return true", iskidFriendlyEligible);
	}
}
