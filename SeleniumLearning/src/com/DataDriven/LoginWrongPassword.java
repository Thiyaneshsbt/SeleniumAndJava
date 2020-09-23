package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWrongPassword {

	@Test
	public void loginwrongUserName() {
				
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.id("txtUsername"));
			userName.sendKeys("Admin");
			
			WebElement passWord=driver.findElement(By.id("txtPassword"));
			passWord.sendKeys("admin124563");
			
			WebElement loginButton=driver.findElement(By.id("btnLogin"));
			loginButton.click();
		
			driver.quit();
		}

}
