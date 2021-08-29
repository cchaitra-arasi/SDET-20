package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vitiger.comcast.genericUtility.BaseClass;
import com.vitiger.comcast.pomrepositylib.Home;
import com.vitiger.comcast.pomrepositylib.Login;

public class PageTitle extends BaseClass{
	@Test
	
	public void  PageTitle() {
		
		/* Navigate to app*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://localhost:8888/");
	    
	    /* step 1 : login */
	    Login loginPage = new Login(driver);
	    loginPage.loginToApp("admin", "admin111");
	    
	    /*step 2 : navigate to organization*/
	    Home homePage = new Home(driver);
	    driver.findElement(By.linkText("Home")).getText();
	   // homePage.getOrganizationLink().click();
	    
	    driver.findElement(By.linkText("Home"));
	    String expectedTitle= "Home";
	    String actualTitle=driver.findElement(By.linkText("Home")).getText();
	    
	    if(actualTitle.equals(expectedTitle))
	    {
	    	System.out.println("pass" + actualTitle +"displayed");
	    }
	    else {
	    	System.out.println("fail" + actualTitle +"not displayed");
	    	
	    }}}
	    	

	   
	    //String expectedTitle= "Organizations";
	    //String actualTitle=driver.findElement(By.linkText("Organizations")).getText();


