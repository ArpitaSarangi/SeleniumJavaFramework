package Introduction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		//Delete Session cookie
		//driver.manage().deleteCookieNamed("sessionKey");
		
		//Click on any link
		//Login Page -verify login url
		
		driver.get("http://google.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("D:screenshot2.png"));
		Files.copy(src, new File("D://screenshot5.png"));

	}

}
