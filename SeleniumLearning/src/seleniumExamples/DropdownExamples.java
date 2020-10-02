package seleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img")).click();
		Thread.sleep(3000);
		
		WebElement dropdown1 =driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		for(int i=0;i<5;i++) {
			select.selectByIndex(i);
			List<WebElement> trs =driver.findElements(By.xpath("//table//tr"));
			for(int j=0;j<trs.size();j++) {
				String col4 = trs.get(j).findElement(By.xpath("//td[4]")).getText();
				if(col4.equals("pending"))
					trs.get(j).findElement(By.xpath("//td[5]")).click();
			}
			
		}
	    select.selectByIndex(1);
	    Thread.sleep(3000);
	    select.selectByValue("2");
	    Thread.sleep(3000);
	    
	    select.selectByVisibleText("Loadrunner");
	    Thread.sleep(3000);
	    
	    List<WebElement> list = select.getOptions();
	    int size = list.size();
	    System.out.println("Number of Elements = "+size);
	    
	    dropdown1.sendKeys("Appium");
	    
	    WebElement multiselect =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	    Select multiselectbox = new Select(multiselect);
	    multiselectbox.selectByIndex(2);
	    multiselectbox.selectByIndex(1);
	    Thread.sleep(5000);
	    multiselectbox.deselectByIndex(2);
	    multiselectbox.deselectByIndex(1);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
