package com.globalsqa.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.globalsqa.qa.base.TestBase;

public class DropDownMenuPage extends TestBase {
	public static String countryToSelect = "India";
	public static String countrySelected;

	// Initializing the Page Objects:
	public DropDownMenuPage() {
		PageFactory.initElements(driver, this);
	}

	// Page Factory:
	@FindBy(id = "Select Country")
	WebElement selectCountry_Tab;

	@FindBy(xpath = "//*[contains(text(),\"Select country from below drop down list:\")]")
	WebElement displayingText;

	@FindBy(tagName = "select")
	public WebElement countryDropDown;

//	@FindBy(id = "menu-item-2818")
//	public WebElement samplePageText_Link;

	// Actions:
	public boolean validateSelectCountryTabTest() {
		return selectCountry_Tab.isSelected();
	}

	public boolean validateDisplayingTextToSelectCountryTest() {
		return displayingText.isDisplayed();
	}

	public void selectCountryFromDropDownTest() {
		Select sel = new Select(countryDropDown);
		sel.selectByVisibleText(countryToSelect);
		WebElement country = sel.getFirstSelectedOption();
		countrySelected = country.getText();
	}

//	public SamplePageTestPage clickSamplePagetextLinkTest() {
//		wait.until(ExpectedConditions.elementToBeClickable(samplePageText_Link));
//		samplePageText_Link.click();
//		return new SamplePageTestPage();
//	}

}
