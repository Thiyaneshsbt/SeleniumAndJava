package framesExamples;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement download = driver.findElement(By.linkText("Download Excel"));
		download.click();
		Thread.sleep(3000);
		File filelocation = new File("C:\\Users\\Thiyanesh\\Downloads");
		
		File[] totalfiles=filelocation.listFiles();
		for (File file : totalfiles) {
			System.out.println("Checking");
			file.getName().equals("testleaf.xls");
			System.out.println("File is downloaded");
			break;
		}
		
	}

}
