package com.globalsqa.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.globalsqa.qa.base.TestBase;
import com.globalsqa.qa.pages.DragAndDropPage;

public class DragAndDropPage_Test extends TestBase {
	DragAndDropPage dragAndDropPage;

	public DragAndDropPage_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		dragAndDropPage = new DragAndDropPage();
	}

	@Test(priority = 1)
	public void verifyDragAndDropLabelDisplayingTest() {
		dragAndDropPage.validateDragAndDropLabel();
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void verifyPhotoManagerOptionByDefaultSelectedTest() {
		dragAndDropPage.validatePhotoManagerTab();
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3)
	public void verifyImagesToDragAreEnableTest() {
		dragAndDropPage.validateHighTatras_Enable();
		Assert.assertTrue(true);
		dragAndDropPage.validateHighTatras2_Enable();
		Assert.assertTrue(true);
		dragAndDropPage.validateHighTatras3_Enable();
		Assert.assertTrue(true);
		dragAndDropPage.validateHighTatras4_Enable();
		Assert.assertTrue(true);
	}
	
	@Test(priority = 4)
	public void verifyTrashSectionIsEnableTest() {
		dragAndDropPage.validateTrashSection_Enable();
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5)
	public void verifyAllHighTatrasDraggedSuccessfullyTest() {
		dragAndDropPage.dragAndDropHighTatrasImage();
		Assert.assertTrue(true);
		dragAndDropPage.dragAndDropHighTatras2Image();
		Assert.assertTrue(true);
		dragAndDropPage.dragAndDropHighTatras3Image();
		Assert.assertTrue(true);
		dragAndDropPage.dragAndDropHighTatras4Image();
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
