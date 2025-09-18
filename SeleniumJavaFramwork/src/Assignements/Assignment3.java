package Assignements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

//import dev.failsafe.internal.util.Durations;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		login(driver);
		products(driver);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("/Users/arpitasarangi/Downloads/Assignment3.jpeg"));
		
	}
	public static void login(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-success']")));
		driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		
		Select dropdown=new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		driver.findElement(By.cssSelector("input[value='Sign In']")).click();
		
	}
	
	public  static void products(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card h-100']")));
		
		List<WebElement> prdList=driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		
		
		for(int i=0;i<prdList.size();i++) {
			//driver.findElement(By.cssSelector("button[class='btn btn-info']"))
			prdList.get(i).click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		
	}
}
