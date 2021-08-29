package com.vitiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(name = "user_name")
	private WebElement userNameEdit;
	
	@FindBy(name = "user_password")
	private WebElement userPasswordEdit;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	public WebElement getUserNameEdt() {
		return userNameEdit;
	}
	
	public WebElement getPasswordEdt() {
		return userPasswordEdit;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
    public void loginToApp(String username, String password)
{    userNameEdit.sendKeys(username);
userPasswordEdit.sendKeys(password);
loginBtn.click();

    	}
}
