package ActionClassSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	
	
	public static void WaitTest() {
		
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("pushkar.bhadang@gmail.com");
		WebElement password=driver.findElement(By.id("input-password"));
		password.sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		WebElement editLink=driver.findElement(By.xpath("//a[contains(text(),'Edit Account')]"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(editLink));
		editLink.click();
		
		System.out.println("waited");
		driver.quit();
		
	}
	
	
	public static void FluentWaitTest() {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("pushkar.bhadang@gmail.com");
		WebElement password=driver.findElement(By.id("input-password"));
		password.sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();		

		WebElement editLink=driver.findElement(By.xpath("//a[contains(text(),'Edit Account')]"));
		
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).
				ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(editLink));
		
		editLink.click();
		
		
	}

	public static void main(String[] args) {
		
		SeleniumWaits.WaitTest();
		System.out.println("***************");
		SeleniumWaits.FluentWaitTest();
	}

}
