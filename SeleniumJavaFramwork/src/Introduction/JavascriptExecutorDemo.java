package Introduction;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		Iterator<WebElement> it = values.iterator();

		int total = 0;
		for (int i = 0; i < values.size(); i++) {
			total += Integer.parseInt(values.get(i).getText());

		}
		System.out.println(total);
		
		String totalValue=driver.findElement(By.className("totalAmount")).getText().split(": ")[1];
		
		Assert.assertEquals(total, Integer.parseInt(totalValue));
		
		System.out.println(Integer.parseInt(totalValue));

	}

}
