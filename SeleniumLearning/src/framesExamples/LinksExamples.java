package framesExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		Thread.sleep(1000);
		
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		driver.navigate().back();
		
		Thread.sleep(3000);
	    
	    
	    WebElement wheretogo = driver.findElement(By.partialLinkText("Find where am supposed to go"));
	    String linkwhere =wheretogo.getAttribute("href");
	    System.out.println("link navigates to "+linkwhere);
	    
	    WebElement brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
	    brokenlink.click();
	    String title=driver.getTitle();
	    if(title.contains("404")){
	    	System.out.println("404");}
	    else {
	    	System.out.println("Not 404");}
	    	
	    driver.navigate().back();
	    
	    WebElement homepage1 = driver.findElement(By.linkText("Go to Home Page"));
		homepage1.click();
	    
	    driver.navigate().back();
	    
	    List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	    int tt = totallinks.size();
	    System.out.println("No of links "+tt);
	           
	    }
	         
	
	}










		
	


