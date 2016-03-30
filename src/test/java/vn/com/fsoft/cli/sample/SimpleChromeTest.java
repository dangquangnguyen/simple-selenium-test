package vn.com.fsoft.cli.sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleChromeTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("https://www.fpt-software.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("FPT Software"));
	}

	@BeforeTest
	public void beforeTest() throws MalformedURLException {
		driver = new RemoteWebDriver(new URL("http://jenkins.devops-pilot.citus.io:4444/wd/hub"), DesiredCapabilities.chrome());
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
