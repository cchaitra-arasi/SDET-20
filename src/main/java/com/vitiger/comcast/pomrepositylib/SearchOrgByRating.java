package com.vitiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOrgByRating {

	WebDriver driver;
	public SearchOrgByRating (WebDriver driver) {
		PageFactory.initElements(driver, this);
	this.driver= driver;
	}
	@FindBy(linkText="Go to Advanced Search")
	private WebElement GotoAdvancedSearch;
	
	

}
