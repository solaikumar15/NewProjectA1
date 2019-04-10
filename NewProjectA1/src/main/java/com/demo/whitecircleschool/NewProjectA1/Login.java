package com.demo.whitecircleschool.NewProjectA1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="username-8")
	private WebElement user;
	
	@FindBy(id="user_password-8")
	private WebElement pass;
	
	@FindBy(id="um-submit-btn")
	private WebElement submit;
	
	// WebElemnt of the Login class to be initialized on the driver
		public Login(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	public void userCredentials(String userName , String password) {
		user.sendKeys(userName);
		pass.sendKeys(password);	
		submit.click();
	}
}


