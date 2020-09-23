package framesExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		WebElement clickme = driver.findElement(By.id("click"));
		clickme.click();
		String text = driver.findElement(By.id("click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement clickme1 = driver.findElement(By.id("click1"));
		clickme1.click();
		String text1 = driver.findElement(By.id("click1")).getText();
		System.out.println(text1);
		driver.switchTo().defaultContent();
		
		List<WebElement> totalcount = driver.findElements(By.tagName("iframe"));
		int s = totalcount.size();
		System.out.println(s);
		
		List<WebElement> totalcount1 = driver.findElements(By.tagName("img"));
		int s1 = totalcount1.size();
		System.out.println(s1);
		
		List<WebElement> totalcount2 = driver.findElements(By.tagName("div"));
		int s2 = totalcount2.size();
		System.out.println(s2);
		
		List<WebElement> totalcount3 = driver.findElements(By.tagName("br"));
		int s3 = totalcount3.size();
		System.out.println(s3);
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
