package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a/h5")).click();
		Thread.sleep(1000);

		WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		Checkbox.click();
		
		WebElement Checkbox1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[3]/input"));
		Checkbox1.click();
		
		WebElement Checkbox2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean boo = Checkbox2.isSelected();
		System.out.println("Selected "+boo);
		
		WebElement firstelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]"));
		if(firstelement.isSelected()) {
			firstelement.click();
		}
			/*WebElement secondelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]"));
			if(secondelement.isSelected()) {
			secondelement.click();
			}*/
		
		WebElement firstcheckbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[1]/input"));
		firstcheckbox.click();
		WebElement firstcheckbox1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[2]/input"));
		firstcheckbox1.click();
		WebElement firstcheckbox2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[3]/input"));
		firstcheckbox2.click();
		WebElement firstcheckbox3 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[4]/input"));
		firstcheckbox3.click();
		WebElement firstcheckbox4 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[5]/input"));
		firstcheckbox4.click();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
