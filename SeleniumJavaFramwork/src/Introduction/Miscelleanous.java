package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//Delete Session cookie
		//driver.manage().deleteCookieNamed("sessionKey");
		
		//Click on any link
		//Login Page -verify login url
		
		
		
		driver.get("http://google.com");

	}

}
