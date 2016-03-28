package vn.com.fsoft.cli.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("https://www.fpt-software.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("FPT Software"));
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
