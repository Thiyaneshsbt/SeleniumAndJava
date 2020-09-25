package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {

	WebDriver driver;
	

		@Given("user enters is search term in google.co.in")
		public void user_enters_is_search_term_in_google_co_in() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.co.in");
		}


		

		@When("user is typing is {string}")
		public void user_is_typing_is(String searchTerm) {
		    driver.findElement(By.name("q")).sendKeys("Thiyanesh");
		}
		@Then("click the enters key")
		public void click_the_enters_key() {
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		}
		@Then("user should see the test results")
		public void user_should_see_the_test_results() {
		    boolean boo=driver.findElement(By.partialLinkText("Thiyanesh1")).isDisplayed();
		    if(boo) {
		    	System.out.println("Results displayed");
		    }
		}
}

