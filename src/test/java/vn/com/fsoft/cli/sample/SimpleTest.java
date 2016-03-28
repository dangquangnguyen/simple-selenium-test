package vn.com.fsoft.cli.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://www.guru99.com/selenium-tutorial.html");
		String title = driver.getTitle();
		AssertJUnit.assertTrue(title.contains("Free Selenium Tutorials"));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new SafariDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
