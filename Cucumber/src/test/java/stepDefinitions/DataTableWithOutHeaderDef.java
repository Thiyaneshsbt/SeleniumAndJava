package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableWithOutHeaderDef {

	WebDriver driver;
	
	@Given("You are in login page")
	public void you_are_in_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}


	@Given("You enter the below credentials")
	public void you_enter_the_below_credentials(DataTable dataTable) {
		List<String> credentials=dataTable.transpose().asList(String.class);
		String uName=credentials.get(0);
		String pWord=credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(uName);
		driver.findElement(By.id("txtPassword")).sendKeys(pWord);
	}
	@Then("You should see the login window")
	public void you_should_see_the_login_window() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
	}



}
