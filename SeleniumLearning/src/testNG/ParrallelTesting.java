package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParrallelTesting {

	@Test
	public void openGoogle() {
		WebDriver driver;
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		driver.quit();
	}
	@Test
	public void openBing() {
		WebDriver driver;
		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bing.com");
		driver.quit();
	}
	
	}
