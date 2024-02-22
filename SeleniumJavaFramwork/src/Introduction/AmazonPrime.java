package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class AmazonPrime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.className("qWtUWN")).click();
		driver.findElement(By.xpath("//h3[@aria-label='Kids']")).click();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		driver.findElement(By.xpath("//article[@data-card-title='The Lego Movie']/section/div/a")).click();
		
		
		

	}

}
