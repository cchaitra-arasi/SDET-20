package com.vtiger.comcast.organisationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vitiger.comcast.pomrepositylib.Home;
import com.vitiger.comcast.pomrepositylib.Login;
import com.vitiger.comcast.pomrepositylib.SearchOrgBy;


//import com.vtiger.comcast.pomrepositylib.Home;
//import com.vtiger.comcast.pomrepositylib.Login;
//import com.vtiger.comcast.pomrepositylib.searchOrgByPhone;

public class SearchOrgByPhone_TC_28 {


		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			/* Navigate to app*/
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("http://localhost:8888/");
		    
		    /* step 1 : login */
		    Login loginPage = new Login(driver);
		    loginPage.loginToApp("admin", "admin111");
		    
		    /*step 2 : navigate to organization*/
		    Home homePage = new Home(driver);
		    homePage.getOrganizationLink().click();
		    
		    /*step 3 : search organization by Phone*/
	     SearchOrgBy searchIn = new SearchOrgBy(driver);
	     searchIn.getSearchtext().sendKeys("9988998899");
	     searchIn.Selection("Phone");
	     searchIn.getSearchBtn().click();
	     
	     /*step 5 : verify phone details display
	        SearchOrgBy searchIn = new SearchOrgBy(driver);
	        String  actSuccessfullMg =  orginfoPage.getSuccessfullMsg().getText();
	        if(actSuccessfullMg.contains(orgName)) {
	        	System.out.println(orgName + "==>created successfully");
	        }else {
	        	System.out.println(orgName + "==> not created successfully");*/

	     
	     /*step 4 : logout*/
	     homePage.logout();
	     
	      

	}

}
