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
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Broken URL
		// Step1 - Is to get all Urls tied u to the links using Selenium
		// Java Methods will call URL's and gets you the status code
		// If the status code>400 then that Url is not working ->link which tied to Url
		// is broken
		// a[href*="soapui"]

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			// String url =
			// driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();

			int respCode = conn.getResponseCode();
			System.out.println(respCode);

			// Soft Assertion
			a.assertTrue(respCode < 400,
					"The link with text " + link.getText() + " is broken with the code :" + respCode);

			// Hard Assertion
			// Assert.assertTrue(respCode<400,"The link with text "+ link.getText()+" is
			// broken with the code :"+respCode);

			/*
			 * if (respCode > 400) { System.out.println("The link with text "+
			 * link.getText()+" is broken with the code :"+respCode);
			 * Assert.assertTrue(false); }
			 */
		}
		a.assertAll();
	}

}
