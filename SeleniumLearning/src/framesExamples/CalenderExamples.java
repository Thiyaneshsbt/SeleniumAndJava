package framesExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		Thread.sleep(1000);

		WebElement calendar = driver.findElement(By.id("datepicker"));
		// calendar.sendKeys("01/07/2020" +Keys.ENTER);

		calendar.click();

		WebElement nextButton = driver.findElement(By.xpath(" //a[@title='Next']"));

		nextButton.click();

		// a[contains(text(),'10')]
		// *[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[5]/a

		WebElement dateToBeGiven = driver.findElement(By.xpath("//a[contains(text(),'10')]"));

		dateToBeGiven.click();
	}
}
