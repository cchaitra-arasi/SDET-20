package com.vitiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

public class SearchOrgBy {

	WebDriver driver;
	public SearchOrgBy (WebDriver driver) {
		PageFactory.initElements(driver, this);
	this.driver= driver;


	}
	@FindBy(name="search_text")
	private WebElement searchtext;
	
	
	@FindBy(name="search_field")
	private WebElement searchDropDown;
	
	@FindBy(xpath="//span[@vtfieldname='phone']/parent::td")
	private WebElement phoneverification;
	
	
	public WebElement getPhoneverification() {
		return phoneverification;
	}
	@FindBy(name="submit")
	private WebElement searchBtn;
	
	

		
	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getSearchDropDown() {
		return searchDropDown;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void Selection(String str)
	{
		Select s =new Select(searchDropDown);
		s.selectByVisibleText(str);
	}
//	public void searchOrg() 
//		Select sel = new Select(searchDropDown);
//		sel.selectByValue("Phone");
//		
//		Select sel1 = new Select(searchDropDown);
//		sel1.selectByValue("Website");
//		
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(searchBtn).perform();
//		searchBtn.click();
//	}
//	
	


	}

