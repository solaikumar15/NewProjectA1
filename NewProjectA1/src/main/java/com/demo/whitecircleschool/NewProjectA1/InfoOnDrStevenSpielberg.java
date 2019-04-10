package com.demo.whitecircleschool.NewProjectA1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoOnDrStevenSpielberg {
	
	@FindBy(css="body > div.elementor.elementor-145 > div > div > section.elementor-element.elementor-element-795f653.elementor-section-height-min-height.elementor-section-boxed.elementor-section-height-default.elementor-section-items-middle.elementor-section.elementor-top-section > div > div > div.elementor-element.elementor-element-64118b7.elementor-column.elementor-col-33.elementor-top-column > div > div > div > div > div > img")
	private WebElement Logo;
	
	@FindBy(css="body > div.elementor.elementor-145 > div > div > section.elementor-element.elementor-element-795f653.elementor-section-height-min-height.elementor-section-boxed.elementor-section-height-default.elementor-section-items-middle.elementor-section.elementor-top-section > div > div > div.elementor-element.elementor-element-7b27ef7.elementor-column.elementor-col-66.elementor-top-column > div > div > div.elementor-element.elementor-element-4c7c39d.elementor-widget.elementor-widget-text-editor > div > div > p > font > font")
	private WebElement HeaderTitle;
	
	@FindBy(css="body > div.elementor.elementor-145 > div > div > section.elementor-element.elementor-element-795f653.elementor-section-height-min-height.elementor-section-boxed.elementor-section-height-default.elementor-section-items-middle.elementor-section.elementor-top-section > div > div > div.elementor-element.elementor-element-7b27ef7.elementor-column.elementor-col-66.elementor-top-column > div > div > div.elementor-element.elementor-element-6ade9d7.elementor-widget.elementor-widget-text-editor > div > div > p > font > font")
	private WebElement Rating;
	
	@FindBy(xpath="(//button[contains(@class,'button'])[1]")
	private WebElement Vote;
	
	@FindBy(xpath="(//font[contains(@style,'vertical')])[6]")
	private WebElement TitleInfo;
	
	@FindBy(xpath="(//font[contains(@style,'vertical')])[7]")
	private WebElement Description;
	
	@FindBy(xpath="(//font[contains(@style,'vertical')])[10]")
	private WebElement CreatedAt;
	
	// WebElement of the Login class to be initialized on the driver
		public InfoOnDrStevenSpielberg(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public void infopage() {
			Vote.click();
		}
		
		public WebElement getLogo() {
			return Logo;
					
		}
		
		public WebElement getHeaderTitle() {
			return HeaderTitle;
					
		}
		
		public WebElement getRating() {
			return Rating;
			
		}
		
		public WebElement getTitleInfo() {
			return TitleInfo;
			
		}
		
		public WebElement getDescription() {
			return Description;
			
		}
		
		public WebElement getCreatedAt() {
			return CreatedAt;
			
		}
}
