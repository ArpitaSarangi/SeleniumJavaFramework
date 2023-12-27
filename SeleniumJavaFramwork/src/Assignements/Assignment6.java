package Assignements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

public class Assignment6 {

	public static void main(String[] args) throws IOException {

		// Steps
		// 1.Select any check box
		// 2.Grab the label of the selected checkbox //put into variable
		// 3.Select an option in dropdown. Here option to select should come from step-1
		// //Don't hardcode text.drive it dynamically from stem step-2
		// 4.Enter step-2 grabbed label text into editbox //Don't hardcode
		// 5.Click on alert and then verify if text grabbed on ste-2 is present in the
		// pop-up message or not

		// Don't hardcode the label part

		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption3")).click();
		String labelName = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[3]")).getText();

		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(labelName);
		
		
		driver.findElement(By.id("name")).sendKeys(labelName);
		driver.findElement(By.cssSelector("input[onClick='displayAlert()']")).click();
	
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello "+labelName+", share this practice page and share your knowledge");
		driver.switchTo().alert().accept();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D://Assignment6.png"));

	}

}
