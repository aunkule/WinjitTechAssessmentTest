package com.globalsqa.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.globalsqa.qa.base.TestBase;
import com.globalsqa.qa.pages.DragAndDropPage;
import com.globalsqa.qa.pages.DropDownMenuPage;

public class DropDownMenuPage_Test extends TestBase {
	DragAndDropPage dragAndDropPage;
	DropDownMenuPage dropDownMenuPage;

	DropDownMenuPage_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		dragAndDropPage = new DragAndDropPage();
		dropDownMenuPage = new DropDownMenuPage();
	}

	@Test(priority = 1)
	public void verifyPresenceOfSelectCountryTabTest() {
		dragAndDropPage.clickDropDownMenuLink();
		dropDownMenuPage.validateSelectCountryTabTest();
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void verifyTextDisplayingToSelectCountryTest() {
		dragAndDropPage.clickDropDownMenuLink();
		dropDownMenuPage.validateDisplayingTextToSelectCountryTest();
		Assert.assertTrue(true);
	}

	@Test(priority = 3)
	public void verifySelectedCountryFromDropDownTest() {
		dragAndDropPage.clickDropDownMenuLink();
		dropDownMenuPage.selectCountryFromDropDownTest();
		Assert.assertEquals(dropDownMenuPage.countrySelected, dropDownMenuPage.countryToSelect);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
