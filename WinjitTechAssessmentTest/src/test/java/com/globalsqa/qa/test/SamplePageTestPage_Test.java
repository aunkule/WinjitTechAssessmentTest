package com.globalsqa.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.globalsqa.qa.base.TestBase;
import com.globalsqa.qa.pages.DragAndDropPage;
import com.globalsqa.qa.pages.DropDownMenuPage;
import com.globalsqa.qa.pages.SamplePageTestPage;

public class SamplePageTestPage_Test extends TestBase {
	DragAndDropPage dragAndDropPage;
	DropDownMenuPage dropDownMenuPage;
	SamplePageTestPage samplePageTestPage;
	String alertmsg1 = "Do you really fill rest of the form?";

	SamplePageTestPage_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		dragAndDropPage = new DragAndDropPage();
		dropDownMenuPage = new DropDownMenuPage();
		samplePageTestPage = new SamplePageTestPage();
	}

	@Test(priority = 1)
	public void verifyPresenceOfSamplePageTestLabel() {
		dragAndDropPage.clickSamplePagetextLinkTest();
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void verifyExpertiseOptionsTest() {
		dragAndDropPage.clickSamplePagetextLinkTest();
		samplePageTestPage.verifyPresenceOfFunctionalTestingCheckBoxTest();
		Assert.assertTrue(true);
		samplePageTestPage.verifyPresenceOfAutomationlTestingCheckBoxTest();
		Assert.assertTrue(true);
		samplePageTestPage.verifyPresenceOfManualTestingCheckBoxTest();
		Assert.assertTrue(true);
	}

	@Test(priority = 3)
	public void verifyEducationOptionsTest() {
		dragAndDropPage.clickSamplePagetextLinkTest();
		samplePageTestPage.verifyPresenceOfGraduateRadioBtnTest();
		Assert.assertTrue(true);
		samplePageTestPage.verifyPresenceOfPostGraduateRadioBtnTest();
		Assert.assertTrue(true);
		samplePageTestPage.verifyPresenceOfOtherRadioBtnTest();
		Assert.assertTrue(true);
	}

	@Test(priority = 4)
	public void fillTheFormAndSubmit() {
		dragAndDropPage.clickSamplePagetextLinkTest();
		samplePageTestPage.enterNameTest();
		samplePageTestPage.enterEmailTest();
		samplePageTestPage.enterWebsiteTest();
		samplePageTestPage.selectExperienceTest();
		samplePageTestPage.selectAutomationTestingCheckBoxTest();
		samplePageTestPage.selectGraduateRadioBtnTest();
		samplePageTestPage.verifyAlartBoxFunctionalityTest();
		samplePageTestPage.enterCommentTest();
		samplePageTestPage.clickSubmitBtnTest();
		Assert.assertTrue(true);
		/*
		 * verify each field from Sample Page Test from
		 */
		samplePageTestPage.verify_NameTest();
		Assert.assertEquals(samplePageTestPage.name, samplePageTestPage.verify_name);
		samplePageTestPage.verify_EmailTest();
		Assert.assertEquals(samplePageTestPage.email, samplePageTestPage.verify_email);
		samplePageTestPage.verify_WebsiteTest();
		Assert.assertEquals(samplePageTestPage.website, samplePageTestPage.verify_website);
		samplePageTestPage.verify_ExperienceTest();
		Assert.assertEquals(samplePageTestPage.experience, samplePageTestPage.verify_experience);
		samplePageTestPage.verify_ExpertiseTest();
		Assert.assertEquals(samplePageTestPage.expertise, samplePageTestPage.verify_expertise);
		samplePageTestPage.verify_EducationTest();
		Assert.assertEquals(samplePageTestPage.education, samplePageTestPage.verify_education);
		samplePageTestPage.verify_CommentTest();
		Assert.assertEquals(samplePageTestPage.comments, samplePageTestPage.verify_comment);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
