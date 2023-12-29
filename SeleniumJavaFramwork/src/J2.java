import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class J2 {
	@Test
	public void check() {
		J1.login("Arpita");
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opentext.com/");
		driver.manage().co
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		List<WebElement> cloud=driver.findElements(By.xpath("//li[@class='nav-item']/a[contains(text(),'Cloud')]"));
		//Iterator it=cloud.iterator();
		//WebElement m=driver.findElement(By.xpath("//a[text()='Learn more']"));
		
		for(WebElement w:cloud) {
				w.click();
			//m.click();
			//Assert.assertEquals(m.getText(), "Learn More");
		}
		
	}

	
}
