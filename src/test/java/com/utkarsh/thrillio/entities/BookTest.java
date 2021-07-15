package com.utkarsh.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utkarsh.thrillio.constants.BookGenre;
import com.utkarsh.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible(){
		//Test 1
		 Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
					new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		 
		 boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		 
		 assertFalse("for philosophy genre - isKidFriendlyEligible should return false",isKidFriendlyEligible);
		
		 //Test 2
		 book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
					new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);
		 
         isKidFriendlyEligible = book.isKidFriendlyEligible();
		 
		 assertFalse("for self help genre - isKidFriendlyEligible should return false",isKidFriendlyEligible);
	}

}
