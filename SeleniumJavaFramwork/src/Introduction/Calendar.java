package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion");
		// April 14

		// Scroll the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

		//CLick on the calender field		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();

		//Click on the month
		while (!driver.findElement(By.className("flatpickr-current-month")).getText().contains("April")) {

			driver.findElement(By.className("flatpickr-next-month")).click();
			Thread.sleep(2000);
		}

		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		// Grab common attribute
		// Put into list and iterates

		int count = driver.findElements(By.className("flatpickr-day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if (text.equalsIgnoreCase("14")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}

	}

}
