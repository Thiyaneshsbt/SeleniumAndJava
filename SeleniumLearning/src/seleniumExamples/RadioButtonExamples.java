package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a")).click();
		Thread.sleep(1000);

		WebElement radiobutton = driver.findElement(By.id("yes"));
		radiobutton.click();
		
		WebElement radiobuttonisSelected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean boo = radiobuttonisSelected.isSelected();
		System.out.println("Radio button is selected = "+boo);
		
		WebElement radiobuttonisdeSelected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		boolean boo1 = radiobuttonisdeSelected.isSelected();
		System.out.println("Radio button is UNselected = "+boo1);
		
		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[3]"));
		radiobutton1.click();
		
		
		
	}

}
