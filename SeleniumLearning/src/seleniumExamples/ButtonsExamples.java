package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		WebElement position = driver.findElement(By.id("position"));
		Point xypoint =position.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value position = "+xValue);
		System.out.println("Y value position = "+yValue);
		
		WebElement color = driver.findElement(By.id("color"));
		String bgcolor=color.getCssValue("background-color");
		System.out.println("background-color= "+bgcolor);
		
		WebElement size = driver.findElement(By.id("size"));//webelement identification
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		
		System.out.println("Button height "+height);
		System.out.println("Button Width "+width);
		
		WebElement homebutton = driver.findElement(By.id("home"));
        homebutton.click();
		
		
		
		
		
		
	}

}
