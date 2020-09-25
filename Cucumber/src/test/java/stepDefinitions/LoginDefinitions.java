package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitions {

	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	   
	}




	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - user enters user name and password");
		  driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks login button");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		System.out.println("user is navigated to HOME page");
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
				Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	@Then("You should see Logout button")
	public void you_should_see_logout_button() {
		WebElement logout = driver.findElement(By.xpath("//*[@id='welcome']"));
		if (logout.isDisplayed()){
			System.out.println("Login Successfull");
	}

	}

}
