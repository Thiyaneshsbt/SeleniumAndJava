package seleniumExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img")).click();
		Thread.sleep(1000);
		
		WebElement alertbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertbox.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		WebElement confirmbutton=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmbutton.click();
		Thread.sleep(1000);
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.dismiss();
		
		WebElement promt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promt.click();
		Thread.sleep(1000);
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.sendKeys("Khabin");
		alert2.accept();
		
		
		
		
		
	}

}
