package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsingLoginData {

	WebDriver driver;

		@Given("user is on the login page")
		public void user_is_on_the_login_page() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		}


		
		@When("user is enters valid credentials \"(.*?)\" and \"(.*?)\"$")
		public void user_is_enters_valid_credentials_and(String uName, String pWord) {
			 driver.findElement(By.id("txtUsername")).sendKeys(uName);
				driver.findElement(By.id("txtPassword")).sendKeys(pWord);
		}
		@When("Click login button")
		public void click_login_button() throws InterruptedException {
			
			driver.findElement(By.id("btnLogin")).click();
		}
		@Then("You should see the Home page")
		public void you_should_see_the_home_page() {
			String actualTitle = driver.getTitle();
			String expectedTitle = "OrangeHRM";
					Assert.assertEquals(actualTitle,expectedTitle);
					System.out.println("Passed");
		}



}
