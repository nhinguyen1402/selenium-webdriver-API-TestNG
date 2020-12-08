package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic02_checkEnvironment {
	static WebDriver driver;
  @Test
  public void TestCase1() {
  }
  
  @Test
  public void TestCase2() {
  }
  
  @Test
  public void TestCase3() {
  }
  
  @Test
  public void TestCase4() {
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Nhi Nhi\\Documents\\Testing_Selenium 3xx\\Geckofriver\\geckodriver.exe");

		driver = new  FirefoxDriver();
		driver.get("https://www.facebook.com/");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
