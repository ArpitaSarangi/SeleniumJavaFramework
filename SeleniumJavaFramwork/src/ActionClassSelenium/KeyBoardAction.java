package ActionClassSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {
	
	
	public static void keysDownTest() {
		ChromeOptions option=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchtext=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		Actions action=new Actions(driver);
		action.sendKeys(searchtext, "selenium").build().perform();
		action.sendKeys(searchtext,Keys.ARROW_DOWN).build().perform();
		action.sendKeys(searchtext, Keys.ENTER).build().perform();
		
		System.out.println("selenium searched");
		
		driver.quit();
	}

	public static void main(String[] args) {
		
		KeyBoardAction.keysDownTest();
		System.out.println("Method keysDownTest executed");

	}

}
