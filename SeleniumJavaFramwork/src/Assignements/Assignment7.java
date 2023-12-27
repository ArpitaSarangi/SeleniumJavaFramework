package Assignements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment7 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		// Number of Table rows
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());

		// Number of Table columns
		System.out.println(driver.findElements(By.cssSelector(".table-display tr th")).size());

		// Print the value of 2nd row
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(2)")).getText());
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D://Assignment7.png"));
	}

}
