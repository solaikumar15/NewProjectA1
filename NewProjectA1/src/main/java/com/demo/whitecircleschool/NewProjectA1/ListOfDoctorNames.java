package com.demo.whitecircleschool.NewProjectA1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfDoctorNames {
	
//   1.	Ensure the title name "Doctor List" is displayed
	@FindBy(css="body > div.elementor.elementor-120 > div > div > section.elementor-element.elementor-element-232c027.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > h2")
	@CacheLookup
	private WebElement TitleName;
	
//	 3. Ensure each doctor name is clickable	
	@FindBy(linkText="Dr. Steven Spielberg")
	private WebElement DoctorName;
	
	// WebElement of the Login class to be initialized on the driver
	public ListOfDoctorNames(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getMessage() {
		return TitleName;
		
	}
	
	public void DoctorsName(){
		DoctorName.click();
	}

}
