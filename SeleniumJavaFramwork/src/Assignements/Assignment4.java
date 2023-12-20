package Assignements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Multiple Windows")).click();

		driver.findElement(By.xpath("//div[@class='example']/h3/following-sibling::a[1]")).click();

		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String> it = windowsId.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(parentId);

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='example'] h3")).getText(), "New Window");
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='example']/h3")).getText(), "Opening a new window");
	}

}
