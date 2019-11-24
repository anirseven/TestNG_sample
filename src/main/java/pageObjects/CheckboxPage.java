package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckboxPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/h1")
	public WebElement Chk_HDR;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[1]/label[1]/span[1]")
	public WebElement NY_rdioBtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/fieldset[2]/label[2]/span[1]")
	public WebElement star_chk;
	
	
	public CheckboxPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,20);
		PageFactory.initElements(driver, this);
	}
	
	
	public void performOperation() {
		String title = Chk_HDR.getText();
		System.out.println(title);
		NY_rdioBtn.click();
		star_chk.click();
		
	}
}
