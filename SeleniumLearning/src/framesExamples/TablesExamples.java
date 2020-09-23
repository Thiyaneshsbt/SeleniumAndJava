package framesExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		Thread.sleep(1000);
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of columns " + columnCount);
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number of Rows " + rowCount);

		WebElement getPercent = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String getPerce = getPercent.getText();
		System.out.println("Percentage " + getPerce);

		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> numberList = new ArrayList<Integer>();

	
		
		for (WebElement webElement : allProgress) {
			String individualValue = webElement.getText().replace("%", "");
			numberList.add(Integer.parseInt(individualValue));
		}

		System.out.println("Final list" + numberList);

		int smallValue = Collections.min(numberList);
		System.out.println(smallValue);

		String smallValueString = Integer.toString(smallValue) + "%";

		String finalXpath = "//td[normalize-space()=" + "\"" + smallValueString + "\"" + "]" + "//following::td[1]";

		
		
		System.out.println(finalXpath);

		// td[normalize-space()='20%']//following::td[1]

		Thread.sleep(5000);
		WebElement check = driver.findElement(By.xpath(finalXpath));
		
		check.click();

		/*
		 * int bigValue = Collections.max(numberList); System.out.println(bigValue);
		 * 
		 * String bigValueString = Integer.toString(bigValue) + "%";
		 * 
		 * String finalXpath1 = "//td[normalize-space()=" + "\"" + bigValueString + "\""
		 * + "]" + "//following::td[1]";
		 * 
		 * System.out.println(finalXpath1);
		 * 
		 * // td[normalize-space()='20%']//following::td[1]
		 * 
		 * WebElement check1 = driver.findElement(By.xpath(finalXpath1));
		 * check1.click();
		 */

	}
}
