package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExamples {

	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();

		

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void opengoogle() {

		driver.get("http://www.google.co.in");
	}

	
	 @Test 
	 public void openbing() { 
		 driver.get("http://www.bing.com"); }
	 

	@Test
	public void openyahoo() {
		driver.get("http://www.yahoo.com");
	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totaltime = endTime - startTime;
		System.out.println("Total time " + totaltime);
	}

}
