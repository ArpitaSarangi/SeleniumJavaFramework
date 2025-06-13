import java.time.Duration;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenText {
	@Test
	public void check() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.opentext.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		driver.findElement(By.cssSelector("div[id='onetrust-button-group']button:nth-child(3)")).click();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement m=driver.findElement(By.xpath("//a[text()='Learn more']"));

		WebElement cloudList=driver.findElement(By.cssSelector("div[id='iw_comp1661411175991']div[class='container']"));
		cloudList.findElement(By.xpath("//li[@class='nav-item']/a[contains(text(),'Cloud')]")).click();

		List<WebElement> cloud = driver.findElements(By.xpath("//li[@class='nav-item']/a[contains(text(),'Cloud')]"));
		

		for (WebElement w : cloud) {

			w.click();
			// m.click();
			// Assert.assertEquals(m.getText(), "Learn More");

		}

	}

}
