package com.ramSabhanam.tests;

import org.testng.annotations.Test;

import com.ramSabhanam.common.Common;
import com.ramSabhanam.shadows.CRToolbarSearchField;
import com.ramSabhanam.shadows.DownloadToolsBarShadow;
import com.ramSabhanam.shadows.DownloadsManagerShadow;

/**
 * 
 * Sample TestNG tests
 * 
 * @author RamSabhanam
 *
 */
public class SampleTests {

	DownloadsManagerShadow downloadsManagerShadow = new DownloadsManagerShadow();
	DownloadToolsBarShadow downloadItemsShadow = new DownloadToolsBarShadow();
	CRToolbarSearchField crtoolBarSearchField = new CRToolbarSearchField();
	Common common = new Common();
	
	/**
	 * Searching of 'Hello World' from Search Text field in Google Chrome Downloads
	 */
	@Test
	public void Test001() {
		
		common.navigateTo("chrome://downloads/");
		
		crtoolBarSearchField.inputSearchField("Hello World this is moon light");
		
	}
	
}
