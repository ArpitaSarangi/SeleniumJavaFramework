package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("inputUsername")).sendKeys("arpita");
		driver.findElement(By.name("inputPassword")).sendKeys("pwd");		
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		
		//driver.quit();

	}

}
