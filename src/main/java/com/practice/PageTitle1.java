package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vitiger.comcast.genericUtility.ExcelUtility;
import com.vitiger.comcast.genericUtility.FileUtility;
import com.vitiger.comcast.genericUtility.JavaUtility;
import com.vitiger.comcast.genericUtility.WebDriverUtility;
import com.vitiger.comcast.pomrepositylib.Home;
import com.vitiger.comcast.pomrepositylib.Login;

public class PageTitle1 {
	 public WebDriver driver;
     /*Object Creation for Lib*/
		public JavaUtility jLib = new JavaUtility();
		public WebDriverUtility wLib = new WebDriverUtility();
		public FileUtility fLib = new FileUtility();
		public ExcelUtility eLib = new ExcelUtility();
		
		public ExtentHtmlReporter reporter;
		public ExtentReports reports;
		public ExtentTest test;
		
		@BeforeSuite(groups="smokeTest")
		public void configBS() {
			reporter = new ExtentHtmlReporter("./SDET_20/ExtentReports/SDET20.html");
			
			System.out.println("Before suit executed");
			reporter.config().setDocumentTitle("SDET");
			reporter.config().setTheme(Theme.STANDARD);
			reports = new ExtentReports();
			reports.attachReporter(reporter);
			
				
			System.out.println("===========connect to DB=========");
		}
		
		@BeforeClass(groups="smokeTest")
		public void configBC() {
			System.out.println("===========Launch the Browser=========");
			driver = new ChromeDriver();
			wLib.waitUntilPageLoad(driver);
			driver.manage().window().maximize();
		}
		 @BeforeMethod(groups="smokeTest")
		 public void configBM() throws Throwable {
			 /*common Data*/
			 
				String username = fLib.getPropertyKeyValue("username");
				String password = fLib.getPropertyKeyValue("password");
				String url = fLib.getPropertyKeyValue("url");
				
				String browser = fLib.getPropertyKeyValue("browser");
				  
				/*Navigate to app*/
				driver.get(url);
				
				/*step 1: login */
				Login loginPage = new Login(driver);
		        loginPage.loginToApp(username, password);
		 }
		  @AfterMethod(groups="smokeTest")
		  public void configAM() {
				
		  /* step 2: logout*/
		  Home homePage = new Home(driver);
		  homePage.logout();
		  
}

		  @AfterClass(groups="smokeTest")
			public void configAC() {
				System.out.println("===========Launch the Browser=========");
				driver.quit();
		  }
		  
		  @AfterSuite(groups="smokeTest")
		  
		  public void congigAS() {
			  reports.flush();
			  System.out.println("===========close DB=========");
		  }
@Test
public void HomeText() {
	test=reports.createTest("HomeText");
	Home homePage = new Home(driver);
    driver.findElement(By.linkText("Home")).getText();
   // homePage.getOrganizationLink().click();
    SoftAssert soft= new SoftAssert();
    
    driver.findElement(By.linkText("Home"));
    String expectedText= "Hom";
    String actualText=driver.findElement(By.linkText("Home")).getText();
    soft.assertEquals(actualText, expectedText);
   
    //Assert.assertEquals(actualText, expectedText);
    System.out.println("test 1 pass");
    soft.assertAll();
    //if(actualText.equals(expectedText))
    //{
    	//System.out.println("pass " + actualText +" displayed");
   // }
   // else {
    	//System.out.println("fail " + actualText +" not displayed");
    }
  @Test  
    public void OrganizationText() {
	  test=reports.createTest("OrganisationText");
    	Home homePage = new Home(driver);
    	homePage.getOrganizationLink().click();
        
        
        String expectedText= "Organizations";
        String actualText=driver.findElement(By.linkText("Organizations")).getText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println("test 2 pass");
        
       // if(actualText.equals(expectedText))
        //{
        	//System.out.println("pass " + actualText +"  displayed");
      //  }
       // else {
        //	System.out.println("fail " + actualText +" not displayed");
        }
}
		 

		
			
		
