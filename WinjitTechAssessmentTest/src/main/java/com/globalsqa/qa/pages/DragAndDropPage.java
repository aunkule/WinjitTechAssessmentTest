package com.globalsqa.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.globalsqa.qa.base.TestBase;

public class DragAndDropPage extends TestBase {

	// Initializing the Page Objects:
	public DragAndDropPage() {
		PageFactory.initElements(driver, this);
	}

	// Page Factory:
	@FindBy(xpath = "//div[@class='page_heading']")
	WebElement dragAndDrop_Label;

	@FindBy(id = "Photo Manager")
	WebElement photoManager_Tab;

	@FindBy(xpath = "//*[contains(@data-src,'demoSite/practice/droppable/photo-manager.html')]")
	WebElement lazyloaded_Frame;

	@FindBy(xpath = "(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]")
	WebElement highTatras_Img;

	@FindBy(xpath = "(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]")
	WebElement highTatras2_Img;

	@FindBy(xpath = "(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[3]")
	WebElement highTatras3_Img;

	@FindBy(xpath = "(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[4]")
	WebElement highTatras4_Img;

	@FindBy(id = "trash")
	WebElement trash;

	@FindBy(id = "menu-item-2803")
	WebElement dropDownMenu_Link;

	@FindBy(xpath = "(//span[contains(text(),'Sample Page Test')])[2]")
	WebElement samplePageText_Link;

	// Actions:
	public boolean validateDragAndDropLabel() {
		return dragAndDrop_Label.isDisplayed();
	}

	public boolean validatePhotoManagerTab() {
		return photoManager_Tab.isSelected();
	}

	public boolean validateHighTatras_Enable() {
		driver.switchTo().frame(lazyloaded_Frame);
		wait.until(ExpectedConditions.elementToBeClickable(highTatras_Img));
		highTatras_Img.isEnabled();
		return true;
	}

	public boolean validateHighTatras2_Enable() {
		wait.until(ExpectedConditions.elementToBeClickable(highTatras2_Img));
		highTatras2_Img.isEnabled();
		return true;
	}

	public boolean validateHighTatras3_Enable() {
		wait.until(ExpectedConditions.elementToBeClickable(highTatras3_Img));
		highTatras3_Img.isEnabled();
		return true;
	}

	public boolean validateHighTatras4_Enable() {
		wait.until(ExpectedConditions.elementToBeClickable(highTatras4_Img));
		highTatras4_Img.isEnabled();
		return true;
	}

	public boolean validateTrashSection_Enable() {
		driver.switchTo().frame(lazyloaded_Frame);
		wait.until(ExpectedConditions.elementToBeClickable(trash));
		trash.isEnabled();
		return true;
	}

	/*
	 * Initialization of Actions class
	 */
	Actions action = new Actions(driver);

	public void dragAndDropHighTatrasImage() {
		driver.switchTo().frame(lazyloaded_Frame);
		wait.until(ExpectedConditions.elementToBeClickable(highTatras_Img));
		wait.until(ExpectedConditions.elementToBeClickable(trash));
		action.dragAndDrop(highTatras_Img, trash).build().perform();
	}

	public void dragAndDropHighTatras2Image() {
		wait.until(ExpectedConditions.elementToBeClickable(highTatras2_Img));
		wait.until(ExpectedConditions.elementToBeClickable(trash));
		action.dragAndDrop(highTatras2_Img, trash).build().perform();
	}

	public void dragAndDropHighTatras3Image() {
		wait.until(ExpectedConditions.elementToBeClickable(highTatras3_Img));
		wait.until(ExpectedConditions.elementToBeClickable(trash));
		action.dragAndDrop(highTatras3_Img, trash).build().perform();
	}

	public void dragAndDropHighTatras4Image() {
		wait.until(ExpectedConditions.elementToBeClickable(highTatras4_Img));
		wait.until(ExpectedConditions.elementToBeClickable(trash));
		action.dragAndDrop(highTatras4_Img, trash).build().perform();
	}

	public DropDownMenuPage clickDropDownMenuLink() {
		wait.until(ExpectedConditions.elementToBeClickable(dropDownMenu_Link));
		dropDownMenu_Link.click();
		return new DropDownMenuPage();
	}

	public SamplePageTestPage clickSamplePagetextLinkTest() {
		//js.executeScript("arguments[0].scrollIntoView();", samplePageText_Link);
		js.executeScript("window.scrollBy(0,550)", "");
		wait.until(ExpectedConditions.elementToBeClickable(samplePageText_Link));
		samplePageText_Link.click();
		return new SamplePageTestPage();
	}
}
