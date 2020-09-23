package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextBoxesExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img")).click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("thiyagu.sbt@gmail.com");
		WebElement append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("Thiyanesh");
		boolean boo = append.isEnabled();
		System.out.println(boo);
		WebElement getText = driver.findElement(By.name("username"));
		String value = getText.getAttribute("value");
		System.out.println(value);
		WebElement clear = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clear.clear();
	
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean boo1 = disabledbox.isEnabled();
		System.out.println(boo1);
	}

}
