package Introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		// Q1.Give me the count of links on the page.
		// a -- hyperlink
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		// Q2.Get me the count of the links present in the footer section [Limiting the
		// webdriver scope]

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		

		// Q3.Get the links on the first column of the footer section
		WebElement firstColumn = footerDriver.findElement(By.xpath("//table[@class=\"gf-t\"]/tbody/tr/td[1]/ul"));
		System.out.println(firstColumn.findElements(By.tagName("a")).size());

		// Q4.Click on each link in the column and check if the pages are opening

		for (int i = 1; i < firstColumn.findElements(By.tagName("a")).size(); i++) {
			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);

		}
		
		Set<String> windowIds=driver.getWindowHandles();
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
