package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic1_CheckEnvironment {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Nhi Nhi\\Documents\\Testing_Selenium 3xx\\Geckofriver\\geckodriver.exe");

		driver = new  FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
