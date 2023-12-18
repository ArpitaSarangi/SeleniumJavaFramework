package Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windowsID = driver.getWindowHandles(); // [parentID,childID]
		Iterator<String> it = windowsID.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ")[1].trim()
				.split(" ")[0];

		driver.switchTo().window(parentID);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(emailId);
	}

}
