package com.DataDriven_V2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCases {


	String [][] data= {
			{"Admin","admin123"},
			{"Admin","admin123"},
			{"Admin","admin123"},
			{"Admin","admin123"}
	};



	@DataProvider(name="loginData1")
	public String[][] loginDataProvider(){
		return data;}

	

		@Test(dataProvider="loginData1")
		
		public void logincorrectTestCases(String uName,String pWord) {

			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();


			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.id("txtUsername"));
			userName.sendKeys(uName);

			WebElement passWord=driver.findElement(By.id("txtPassword"));
			passWord.sendKeys("pWord");


			WebElement loginButton=driver.findElement(By.id("btnLogin"));
			loginButton.click();

			driver.quit();
		}

	}
