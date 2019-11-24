package pageObjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindowPage {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id=\"button1\"]")
	public WebElement BrowserWind;

	public SwitchWindowPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}

	public void switchWinAction() {
		BrowserWind.click();
		Set<String> winHandles = driver.getWindowHandles();
		for (String winHandle : winHandles) {
			String pgTitle = driver.switchTo().window(winHandle).getTitle();
			if (pgTitle.equals("Free QA Automation Tools Tutorial for Beginners with Examples")) {
				driver.switchTo().window(winHandle);
			}
		}
	}

}
