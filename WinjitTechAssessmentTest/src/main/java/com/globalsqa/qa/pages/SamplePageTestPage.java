package com.globalsqa.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.globalsqa.qa.base.TestBase;

public class SamplePageTestPage extends TestBase {
	public static String name = "Aditya";
	public static String email = "aditya@gmail.com";
	public static String website = "https://www.globalsqa.com/samplepagetest/";
	public static String experience = "10+";
	public static String expertise;
	public static String education;
	public static String comments = "Test Comment";
	public static String verify_name;
	public static String verify_email;
	public static String verify_website;
	public static String verify_experience;
	public static String verify_expertise;
	public static String verify_education;
	public static String verify_comment;

	// Initializing the Page Objects:
	public SamplePageTestPage() {
		PageFactory.initElements(driver, this);
	}

	// Page Factory:
	@FindBy(xpath = "//h1[contains(text(),'Sample Page Test')]")
	WebElement samplePageTest_Label;

	@FindBy(name = "file-553")
	WebElement chooseFile_Btn;

	@FindBy(id = "g2599-name")
	WebElement name_TestBox;

	@FindBy(id = "g2599-email")
	WebElement email_TestBox;

	@FindBy(id = "g2599-website")
	WebElement website_TestBox;

	@FindBy(id = "g2599-experienceinyears")
	WebElement experience_DropDown;

	@FindBy(xpath = "//input[@value='Functional Testing']")
	WebElement functionaltesting_CheckBox;

	@FindBy(xpath = "(//label[@class='grunion-checkbox-multiple-label checkbox-multiple'])[2]")
	WebElement automationtesting_CheckBox;

	@FindBy(xpath = "//input[@value='Manual Testing']")
	WebElement manualtesting_CheckBox;

	@FindBy(xpath = "(//label[contains(@class,'grunion-radio-label')])[1]")
	WebElement graduate_RadioBtn;

	@FindBy(xpath = "//input[@value='Post Graduate']")
	WebElement postGraduate_RadioBtn;

	@FindBy(xpath = "//input[@value='Other']")
	WebElement other_RadioBtn;

	@FindBy(xpath = "//button[contains(text(),'Alert Box : Click Here')]")
	WebElement alertBox_ClickHere_Btn;

	@FindBy(name = "g2599-comment")
	WebElement comment_TextArea;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit_Btn;

	@FindBy(xpath = "(//*[@class='contact-form-submission']/p)[1]")
	WebElement verify_Name;

	@FindBy(xpath = "(//*[@class='contact-form-submission']/p)[2]")
	WebElement verify_Email;

	@FindBy(xpath = "(//*[@class='contact-form-submission']/p)[3]")
	WebElement verify_Website;

	@FindBy(xpath = "(//*[@class='contact-form-submission']/p)[4]")
	WebElement verify_Experience;

	@FindBy(xpath = "(//*[@class='contact-form-submission']/p)[5]")
	WebElement verify_Expertise;

	@FindBy(xpath = "(//*[@class='contact-form-submission']/p)[6]")
	WebElement verify_Education;
	
	@FindBy(xpath = "(//*[@class='contact-form-submission']/p)[7]")
	WebElement verify_Comment;

	// Actions:
	public boolean validateSamplePageTestTabTest() {
		return samplePageTest_Label.isDisplayed();
	}

	public boolean validateChooseFileFunctionalityTest() {
		chooseFile_Btn.sendKeys(
				"E:\\Aditya Eclipse Workspace\\WinjitTechAssessmentTest\\src\\main\\resources\\FileForTesting.txt");
		return true;
	}

	public void enterNameTest() {
		name_TestBox.sendKeys(name);
	}

	public void enterEmailTest() {
		name_TestBox.sendKeys(Keys.TAB);
		email_TestBox.sendKeys(email);
	}

	public void enterWebsiteTest() {
		website_TestBox.sendKeys(website);
	}

	public void selectExperienceTest() {
		js.executeScript("window.scrollBy(0,250)", "");
		Select select = new Select(experience_DropDown);
		select.selectByValue(experience);
	}

	public boolean verifyPresenceOfFunctionalTestingCheckBoxTest() {
		return functionaltesting_CheckBox.isEnabled();
	}

	public boolean verifyPresenceOfAutomationlTestingCheckBoxTest() {
		return automationtesting_CheckBox.isEnabled();
	}

	public boolean verifyPresenceOfManualTestingCheckBoxTest() {
		return manualtesting_CheckBox.isEnabled();
	}

	public void selectAutomationTestingCheckBoxTest() {
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.elementToBeClickable(automationtesting_CheckBox));
		automationtesting_CheckBox.click();
		expertise = automationtesting_CheckBox.getText().trim();
	}

	public boolean verifyPresenceOfGraduateRadioBtnTest() {
		return graduate_RadioBtn.isEnabled();
	}

	public boolean verifyPresenceOfPostGraduateRadioBtnTest() {
		return postGraduate_RadioBtn.isEnabled();
	}

	public boolean verifyPresenceOfOtherRadioBtnTest() {
		return other_RadioBtn.isEnabled();
	}

	public void selectGraduateRadioBtnTest() {
		wait.until(ExpectedConditions.elementToBeClickable(graduate_RadioBtn));
		graduate_RadioBtn.click();
		education = graduate_RadioBtn.getText();
	}

	public void verifyAlartBoxFunctionalityTest() {
		alertBox_ClickHere_Btn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
	}

	public void enterCommentTest() {
		comment_TextArea.sendKeys(comments);
	}

	public void clickSubmitBtnTest() {
		js.executeScript("window.scrollBy(0,250)", "");
		submit_Btn.click();
	}

	public String verify_NameTest() {
		wait.until(ExpectedConditions.elementToBeClickable(verify_Name));
		verify_name = verify_Name.getText().split(" ")[1];
		return verify_name;
	}

	public String verify_EmailTest() {
		wait.until(ExpectedConditions.elementToBeClickable(verify_Email));
		verify_email = verify_Email.getText().split(" ")[1];
		return verify_email;
	}

	public String verify_WebsiteTest() {
		wait.until(ExpectedConditions.elementToBeClickable(verify_Website));
		verify_website = verify_Website.getText().split(" ")[1];
		return verify_website;
	}

	public String verify_ExperienceTest() {
		wait.until(ExpectedConditions.elementToBeClickable(verify_Experience));
		verify_experience = verify_Experience.getText().split(":")[1].trim();
		return verify_experience;
	}

	public String verify_ExpertiseTest() {
		wait.until(ExpectedConditions.elementToBeClickable(verify_Expertise));
		verify_expertise = verify_Expertise.getText().split("::")[1].trim();
		return verify_expertise;
	}

	public String verify_EducationTest() {
		wait.until(ExpectedConditions.elementToBeClickable(verify_Education));
		verify_education = verify_Education.getText().split(" ")[1];
		return verify_education;
	}
	
	public String verify_CommentTest() {
		wait.until(ExpectedConditions.elementToBeClickable(verify_Comment));
		verify_comment = verify_Comment.getText().split(":")[1].trim();;
		return verify_comment;
	}
}
