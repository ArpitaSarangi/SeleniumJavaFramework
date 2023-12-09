package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("inputUsername")).sendKeys("arpita");
		driver.findElement(By.name("inputPassword")).sendKeys("pwd");		
		driver.findElement(By.className("signInBtn")).click();
		
		//implicit wait - 5 seconds timeout
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Arpita");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("arpita123@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123");
		//driver.findElement(By.className("go-to-login-btn")).click();
		
		
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p.infoMsg")).getText());
		driver.findElement(By.xpath("//div[(@class='forgot-pwd-btn-conainer')]/button[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Mama");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
		
		driver.quit();

	}

}
