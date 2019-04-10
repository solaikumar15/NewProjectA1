package com.demo.whitecircleschool.NewProjectA1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassTest {
	WebDriver driver;

	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// 1. Open the browser
		driver = new ChromeDriver();
// 2. Maximize the browser
		driver.manage().window().maximize();
// 3. Navigate to the application page
		driver.get("http://demo.whitecircleschool.com/project-a1/");
	}
	
//	@AfterClass
//	public void closeBrowser() {
//		driver.quit();
//	}

}
