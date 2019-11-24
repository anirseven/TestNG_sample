package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver = null;

	public void navigate() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anir\\eclipse-workspace\\Cucumber_sample\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");

	}
	
	public void closeApp() {
		driver.close();
		driver.quit();
	}

}
