package framesExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		Thread.sleep(1000);
		
		WebElement img = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		
		img.click();
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a/img")).click();
	    Thread.sleep(3000);
		WebElement img1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		
		//naturalWidth=0 means broken image
    
        
	if(img1.getAttribute("naturalWidth").equals("0")){
		System.out.println("broken image");}
		else
			System.out.println("not a broken image");
	}


}








		
	


