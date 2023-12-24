package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
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
	}

}
