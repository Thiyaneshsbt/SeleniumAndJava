

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> item1 = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = item1.size();
		System.out.println(size);
		
		Actions actions = new Actions(driver);
		/*actions.keyDown(Keys.CONTROL).
		click(item1.get(0)).
		click(item1.get(1)).
		click(item1.get(3)).
		click(item1.get(5)).
		build().perform();*/
		
		actions.clickAndHold(item1.get(0));
		actions.clickAndHold(item1.get(2));
		actions.clickAndHold(item1.get(4));
		//actions.clickAndHold(item1.get(6));
		actions.build().perform();
		
		
	}

}
