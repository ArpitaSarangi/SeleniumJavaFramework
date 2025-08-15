package ActionClassSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAction {

	public static void main(String[] args) {
		
		System.out.println("OS Name :"+System.getProperty("os.name"));
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/arpitasarangi/Downloads/chromedriver-mac-arm64/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		
		

	}

}
