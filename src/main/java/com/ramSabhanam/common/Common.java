package com.ramSabhanam.common;

import com.ramSabhanam.extendedShadowDOM.ShadowWebPage;

/**
 * 
 * @author RamSabhanam
 *
 */
public class Common extends ShadowWebPage{

	public void navigateTo(String url) {
		driver.get(url);
	}
}
