package framesExamples;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class Handsonactivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");

		String oldWindow = driver.getWindowHandle();

		System.out.println(oldWindow);

		WebElement newWindowa = driver.findElement(By.id("home"));
		newWindowa.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement countWindow = driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]"));
		countWindow.click();

		Set<String> handles=driver.getWindowHandles();


		for (String newWindow : handles) {

			driver.switchTo().window(newWindow);
		}

		WebElement editbox=driver.findElement(
				By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple=driver.findElement(
				By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		
		openMultiple.click();
		Thread.sleep(3000);
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println("No of windows opened:"+ numberOfWindows);
		
		
Set<String> newWindowHandles=driver.getWindowHandles();
		
		for (String allWindows : newWindowHandles) {
			 if(!allWindows.equals(oldWindow)){
				 driver.switchTo().window(allWindows);
				 driver.close();
			 }
			
		}
		driver.quit();
		
		

	}

}
