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
public class CRToolbarShadow extends ShadowWebPage{
	
	/**
	 * Default constructor should call initiateRoute method
	 */
	public CRToolbarShadow() {
		initiateRoute();
	}

	/**
	 * Please refer ** Readme.md file for creation of this method **
	 */
	public void initiateRoute() {
		try {
			expandParentRoot(By.tagName("cr-toolbar"));
		}catch (Exception ignore) { }
	}
	
}
