package Assignements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("form-comp div.container form.ng-untouched.ng-pristine.ng-invalid div.form-group input.form-control.ng-untouched.ng-pristine.ng-invalid:nth-child(2)")).sendKeys("Arpita");
		//driver.findElement(By.cssSelector("form-comp div.container form.ng-untouched.ng-pristine.ng-invalid div.form-group:nth-child(2) input.form-control.ng-untouched.ng-pristine.ng-invalid:nth-child(2)")).sendKeys("arpita123@gmail.com");
		driver.findElement(By.name("email")).sendKeys("arita123@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select dropdown=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("28/04/1997");
		driver.findElement(By.className("btn-success")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D://Assignment2.png"));
		driver.quit();
	}

}
