package Introduction;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opentext.com/");

		// Capture all cookies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());
		
		
		//Read & Print all the cookies
		for(Cookie k:cookies) {
			
			//Print Name & Value of Cookie
			System.out.println("Name:"+k.getName()+" Value:"+k.getValue());
		}

		System.out.println("*****************************************");
		
		//rints specific cookie according to the name
		System.out.println(driver.manage().getCookieNamed("_gd_visitor"));
	}

}
