package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import manager.BaseClass;
import pageObjects.CheckboxPage;
import pageObjects.Homepage;
import pageObjects.SwitchWindowPage;

public class HomepageTest extends BaseClass {

	Homepage homepage;
	CheckboxPage checkbxpage;
	SwitchWindowPage switchPage;

	@Test(groups= {"UI"})
	public void CheckBoxTest() {

		System.out.println("Running the TEST ");
		homepage = new Homepage(driver);
		homepage.navigateToCheckbox();

		checkbxpage = new CheckboxPage(driver);
		checkbxpage.performOperation();

	}

	@Test(groups= {"UI"})
	public void WindowHandleTest() {
		System.out.println("Running the TEST ");

		homepage = new Homepage(driver);
		homepage.navigateToSwitchWindow();

		switchPage = new SwitchWindowPage(driver);
		switchPage.switchWinAction();

	}
	
	
	@Test(groups= {"NON GUI"})
	public void PinkTest() {
		System.out.println("Sample TESTNG Test - Pink");
	}
	
	
	@Test(groups= {"NON GUI"}, priority=1)
	public void GoldTest() {
		System.out.println("Sample TESTNG Test - Gold");
	}
	

	@BeforeTest
	public void beforeTest() {

		System.out.println("Starting the TEST ");

		navigate();
	}

	@AfterTest
	public void afterTest() {

		System.out.println("Closing the TEST ");
		closeApp();
	}

}
