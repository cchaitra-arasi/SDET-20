package com.vtiger.comcast.organisationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vitiger.comcast.pomrepositylib.Home;
import com.vitiger.comcast.pomrepositylib.Login;
import com.vitiger.comcast.pomrepositylib.SearchOrgBy;

public class SearchOrgByWebsiteTest {

	public static void main(String[] args) {
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
	    
	    /*step 3 : search organization by website*/
     SearchOrgBy searchIn = new SearchOrgBy(driver);
     searchIn.getSearchtext().sendKeys("www.comcast.co");
     searchIn.Selection("Website");
     searchIn.getSearchBtn().click();
    
     /*step 4 : logout*/
    
     homePage.logout();
     
      


	}

}
