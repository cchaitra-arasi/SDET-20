package com.vitiger.comcast.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vitiger.comcast.pomrepositylib.Home;
import com.vitiger.comcast.pomrepositylib.Login;

public class BaseClass {
     public WebDriver driver;
     //public static WebDriver sDriver;
     /*Object Creation for Lib*/
		public JavaUtility jLib = new JavaUtility();
		public WebDriverUtility wLib = new WebDriverUtility();
		public FileUtility fLib = new FileUtility();
		public ExcelUtility eLib = new ExcelUtility();
		
		@BeforeSuite   (groups="smokeTest")
		public void configBS() {
			System.out.println("===========connect to DB=========");
		}
		
		@BeforeClass     (groups="smokeTest")
		public void configBC() {
			System.out.println("===========Launch the Browser=========");
			 driver = new ChromeDriver();
		//sDriver= driver;
			wLib.waitUntilPageLoad(driver);
			driver.manage().window().maximize();
		}
		 @BeforeMethod  (groups="smokeTest")
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
		  @AfterMethod (groups="smokeTest")
		  public void configAM() {
				
		  /* step 2: logout*/
		  Home homePage = new Home(driver);
		  homePage.logout();
		  
}

		  @AfterClass  (groups="smokeTest")
			public void configAC() {
				System.out.println("===========Launch the Browser=========");
				driver.quit();
		  }
		  
		  @AfterSuite  (groups="smokeTest")
		  public void congigAS() {
			  System.out.println("===========close DB=========");


		  
		  
			 
			
			

    	 
     }
}
