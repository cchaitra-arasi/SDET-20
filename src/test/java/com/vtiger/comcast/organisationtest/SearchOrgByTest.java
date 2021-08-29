package com.vtiger.comcast.organisationtest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vitiger.comcast.genericUtility.BaseClass;
import com.vitiger.comcast.pomrepositylib.Home;
import com.vitiger.comcast.pomrepositylib.SearchOrgBy;
public class SearchOrgByTest extends BaseClass {
	@Test (groups="smokeTest")
	public void SearchOrgByPhone_TC_28() throws Throwable {
		int randomInt = jLib.getRanDomNumber();
		String Phone = fLib.getPropertyKeyValue("Phone");
		
		
		/*step 2 : navigate to organization*/
	    Home homePage = new Home(driver);
	    homePage.getOrganizationLink().click();
	    
	    /*step 3 : search organization by Phone*/
     SearchOrgBy searchIn = new SearchOrgBy(driver);
     searchIn.getSearchtext().sendKeys(Phone);;
     searchIn.Selection("Phone");
     searchIn.getSearchBtn().click();
     Thread.sleep(20000);
     
     //String actualtext = searchIn.getPhoneverification().getText();
    // String expectedtext = "9988998899"
     /*step 4":verification*/
     //String expected
     
	}
	



@Test
public void SearchOrgByWebsiteTest() throws Throwable {
	int randomInt = jLib.getRanDomNumber();
	String Website=fLib.getPropertyKeyValue("Website");
	
	/*step 2 : navigate to organization*/
    Home homePage = new Home(driver);
    homePage.getOrganizationLink().click();
    
    /*step 3 : search organization by Phone*/
 SearchOrgBy searchIn = new SearchOrgBy(driver);
 searchIn.getSearchtext().sendKeys(Website);
 searchIn.Selection("Website");
 searchIn.getSearchBtn().click();
}}

