package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vitiger.comcast.genericUtility.ExcelUtility;
import com.vitiger.comcast.genericUtility.FileUtility;
import com.vitiger.comcast.genericUtility.JavaUtility;
import com.vitiger.comcast.genericUtility.WebDriverUtility;
import com.vitiger.comcast.pomrepositylib.Home;
import com.vitiger.comcast.pomrepositylib.Login;
import com.vitiger.comcast.pomrepositylib.SearchOrgBy;

public class SearchOrgByTestNG {
	@Test
	public void SearchOrgByTestNG() throws Throwable {
		
	    
	    /*Object Creation for Lib*/
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		
		int randomInt = jLib.getRanDomNumber();
		
		/*common Data*/
		String username = fLib.getPropertyKeyValue("username");
		String password = fLib.getPropertyKeyValue("password");
		String url = fLib.getPropertyKeyValue("url");
		String browser = fLib.getPropertyKeyValue("browser");
		
		/* Navigate to app*/
		WebDriver driver = new ChromeDriver();
		wLib.waitUntilPageLoad(driver);
        driver.get(url);
        
        /* step 1 : login */
        Login loginPage = new Login(driver);
        loginPage.loginToApp(username, password);
	    
	   
	    
	    /*step 2 : navigate to organization*/
	    Home homePage = new Home(driver);
	    homePage.getOrganizationLink().click();
	    
	    /*step 3 : search organization by Phone*/
     SearchOrgBy searchIn = new SearchOrgBy(driver);
     searchIn.getSearchtext().sendKeys("9988998899");
     searchIn.Selection("Phone");
     searchIn.getSearchBtn().click();
     
     /*step 5 : verify phone details display
        
     
     /*step 4 : logout*/
     homePage.logout();
     
      

}

}

