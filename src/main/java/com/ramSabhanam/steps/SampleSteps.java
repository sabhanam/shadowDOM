package com.ramSabhanam.steps;

import com.ramSabhanam.common.Common;
import com.ramSabhanam.shadows.CRToolbarSearchField;
import com.ramSabhanam.shadows.DownloadToolsBarShadow;
import com.ramSabhanam.shadows.DownloadsManagerShadow;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/**
 * 
 * Sample cucumber steps
 * 
 * @author RamSabhanam
 *
 */
public class SampleSteps {
	
	DownloadsManagerShadow downloadsManagerShadow = new DownloadsManagerShadow();
	DownloadToolsBarShadow downloadItemsShadow = new DownloadToolsBarShadow();
	CRToolbarSearchField crtoolBarSearchField = new CRToolbarSearchField();
	Common common = new Common();
	
	@Given("user is on Chrome Downloads Page")
	public void user_is_on_Chrome_Downloads_Page() {
		
		common.navigateTo("chrome://downloads/");
		
	}

	@When("I type {string} in the Search field")
	public void i_type_in_the_Search_field(String string) throws InterruptedException {
		
		crtoolBarSearchField.inputSearchField(string);
		
		Thread.sleep(2000);
		
	}
	
}
