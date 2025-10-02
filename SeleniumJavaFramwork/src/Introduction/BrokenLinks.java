package Introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// System.setProperty("webdriver.chrome.driver",
		// "D://SOFTWARES/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().getSize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Broken URL
		// Step1 - Is to get all Urls tied u to the links using Selenium
		// Java Methods will call URL's and gets you the status code
		// If the status code>400 then that Url is not working ->link which tied to Url
		// is broken
		// a[href*="soapui"]
		SoftAssert a = new SoftAssert();

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("Skipped : Empty href");
				continue;
			}

			// String url
			// =driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
			try {
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();

				int responseCode = conn.getResponseCode();

				a.assertTrue(responseCode >= 400, "Broken link : " + url + "with the code : " + responseCode);
				a.assertTrue(responseCode <= 400, "Valid link : " + url + "with the code" + responseCode);

			} catch (Exception e) {
				System.out.println("Exception for URL : " + url + " : " + e.getMessage());
			}
		}
		a.assertAll();
		driver.quit();
	}

}
