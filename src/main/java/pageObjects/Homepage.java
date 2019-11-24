package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id=\"menu-top\"]/li[3]/a")
	public WebElement Widget_lnk;

	@FindBy(xpath = "(//a[text()='Checkboxradio'])[2]")
	public WebElement CheckBox_lnk;

	@FindBy(xpath = "//a[text()='Automation Practice Switch Windows']")
	public WebElement SwitchWind_lnk;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}

	public void navigateToCheckbox() {
		Widget_lnk.click();
		wait.until(ExpectedConditions.visibilityOf(CheckBox_lnk));
		CheckBox_lnk.click();

	}

	public void navigateToSwitchWindow() {
		wait.until(ExpectedConditions.visibilityOf(SwitchWind_lnk));
		SwitchWind_lnk.click();

	}

}
