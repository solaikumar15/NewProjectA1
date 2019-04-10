package com.demo.whitecircleschool.NewProjectA1;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.demo.whitecircleschool.NewProjectA1.*;


public class ListOfDoctorNameAndRatingTest extends BaseClassTest {
	
	@Test
	public void DoctorNameValidation() {
		Login lp = new Login(driver);
		ListOfDoctorNames dn = new ListOfDoctorNames(driver);
		InfoOnDrStevenSpielberg sp = new InfoOnDrStevenSpielberg(driver);
		InfoOnDrStevenSpielberg lo = new InfoOnDrStevenSpielberg (driver);
		InfoOnDrStevenSpielberg rt = new InfoOnDrStevenSpielberg (driver);
		InfoOnDrStevenSpielberg tinfo = new InfoOnDrStevenSpielberg (driver);
		InfoOnDrStevenSpielberg dinfo = new InfoOnDrStevenSpielberg (driver);
		InfoOnDrStevenSpielberg cainfo = new InfoOnDrStevenSpielberg (driver);
		
		lp.userCredentials("skumar", "Saumya*71");
		dn.DoctorsName();
		sp.infopage();
		
		boolean logoStatus = lo.getLogo().isDisplayed();
		Assert.assertTrue(logoStatus);
		
		boolean ratingStatus = rt.getLogo().isDisplayed();
		Assert.assertTrue(ratingStatus);
		
		boolean titleInfoStatus = tinfo.getLogo().isDisplayed();
		Assert.assertTrue(titleInfoStatus);
		
		boolean descInfoStatus = dinfo.getLogo().isDisplayed();
		Assert.assertTrue(descInfoStatus);
		
		boolean createdAtInfoStatus = cainfo.getLogo().isDisplayed();
		Assert.assertTrue(createdAtInfoStatus);
		
		String expectedTitle = "Doctor List";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		
		String expectedTitle1 = "Dr. Steven Spielberg";
		String actualTitle1 = driver.getTitle();

		Assert.assertEquals(actualTitle1, expectedTitle1);
		
		
	}

}
