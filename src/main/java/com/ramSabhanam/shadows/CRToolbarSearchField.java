package com.ramSabhanam.shadows;

import org.openqa.selenium.By;

import com.ramSabhanam.extendedShadowDOM.ShadowWebPage;

/**
 * 
 * @author RamSabhanam
 *
 *	A page/shadow which we consider as an entity.
 *	Please refer ** Readme.md ** for more instructions on usage.
 *
 */
public class CRToolbarSearchField extends ShadowWebPage{
	
	/**
	 * Default constructor should call initiateRoute method
	 */
	public CRToolbarSearchField() {
		initiateRoute();
	}

	/**
	 * Please refer ** Readme.md file for creation of this method **
	 */
	public void initiateRoute() {
		try {
			expandParentRoot(By.tagName("cr-toolbar-search-field"));
		}catch (Exception ignore) { }
	}
	
	/**
	 * 
	 * Typing of text in search text field
	 * 
	 * @param searchString : Input that will be typed in search box
	 */
	public void inputSearchField(String searchString) {
		
		sendKeys(By.id("searchInput"), searchString);
		
	}
	
}
