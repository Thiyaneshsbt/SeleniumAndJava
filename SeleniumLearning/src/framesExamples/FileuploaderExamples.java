package framesExamples;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploaderExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/upload.html");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);				

		//Thread.sleep(6000);
		
		
		WebElement uploadButton=driver.findElement(By.name("filename"));

		uploadButton.click();
		
		//C:\Users\THIYANESHWARANSB\Desktop\\upload.txt
		/*String file="C:\\Users\\THIYANESHWARANSB\\Desktop\\upload.txt";
		StringSelection sections = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sections, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		/*
		 * Thread.sleep(6000);
		 * 
		 * WebElement clickme1 = driver.findElement(By.name("filename"));
		 * 
		 * System.out.println("Success");
		 * 
		 * clickme1.click(); System.out.println("Success");
		 */
		//WebElement uploadButton1=driver.findElement(By.name("filename"));

		//uploadButton1.click();
		// windows controls begins here

		//Thread.sleep(3000);
		/*String	file="C:\\Users\\Elcot\\Downloads\\download.xls";

		StringSelection selection = new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);


		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		
		
		
		
		
		
		
		
	}

}
