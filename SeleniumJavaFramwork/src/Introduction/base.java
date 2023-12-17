package Introduction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String itemsNeeded[] = { "Cucumber", "Brocolli", "Carrot", "Beetroot" };

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		addItems(driver, itemsNeeded);
		/*
		 * base b=new base(); b.addItems(driver, itemsNeeded);
		 */
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("(//div[@class='action-block']/button)[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		// driver.close();
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = itemsNeeded.length;

		for (int i = 0; i < products.size(); i++) {

			String nameOfProduct = products.get(i).getText().split(" ")[0];

			// Format the string to get actual vegetable name
			// Check whether name you extracted is resent in array or not.
			// Convert Array into ArrayList for easy search

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(nameOfProduct)) {
				j--;
				// Click Add to cart
				System.out.println(nameOfProduct);
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				// above text xath is not reliable as its having dynamic behaviour
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(j + "//");

				if (j == 0) {
					break;
				}
			}
			System.out.println("********************");
			System.out.println(i);

		}

	}
}
