package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableWithHeader {

	WebDriver driver;
	
	@Given("Navigate to  login page")
	public void navigate_to_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}


	@Given("enter the below credentials")
	public void enter_the_below_credentials(DataTable dataTable) {
		List<Map<String,String>> keyValuePAir=dataTable.asMaps(String.class, String.class);
		String uName=keyValuePAir.get(0).get("username");
		String pWord=keyValuePAir.get(0).get("password");
		driver.findElement(By.id("txtUsername")).sendKeys(uName);
		driver.findElement(By.id("txtPassword")).sendKeys(pWord);
	}
	@Given("Click the login button")
	public void click_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	@Then("You should see the login page")
	public void you_should_see_the_login_page() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
				Assert.assertEquals(actualTitle,expectedTitle);
				System.out.println("Passed");
	}



}
