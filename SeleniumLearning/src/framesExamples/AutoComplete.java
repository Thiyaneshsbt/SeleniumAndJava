package framesExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		Thread.sleep(1000);

		WebElement textbox = driver.findElement(By.id("tags"));
		textbox.sendKeys("s");
		Thread.sleep(6000);

		List<WebElement> optionlist = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		System.out.println("Size " + optionlist.size());

		for (WebElement webElement : optionlist) {
			if (webElement.getText().equals("Web Services")) {
				System.out.println("Selecting ===> " + webElement.getText());
				webElement.click();
				
				break;
			}

		}
	}

}