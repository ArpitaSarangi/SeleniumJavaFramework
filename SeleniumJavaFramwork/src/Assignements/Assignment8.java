package Assignements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("ind");
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
		
		
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.cssSelector("input[id='autocomplete']")).getAttribute("value"));
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D://Assignment8.png"));
		

	}

}
