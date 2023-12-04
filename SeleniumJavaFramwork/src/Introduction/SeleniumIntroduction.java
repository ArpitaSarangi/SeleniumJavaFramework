package Introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome -ChromeDriver extension ->Methods close,get
		//Firefox -FirefoxDriver ->Methods close,get
		//Safari -SafariDriver ->Method close,get
		//WebDriver ->abstract methods close,get
		//WebDriver methods + class methods
		
		//chromedriver.exe -> Chrome Browsers
		//System.setProperty("webdriver.chrome.driver","D://SOFTWARES/chromedriver.exe");
		
		//webdriver.chrome.driver -->value of path
		//WebDriver driver=new ChromeDriver();
		
		//Firefox launch
		//geckodriver
		
		//System.setProperty("webdriver.gecko.driver","D://SOFTWARES/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//Launch Microsoft Edge
		//Edge Browser
		System.setProperty("webdriver.edge.driver", "D://SOFTWARES/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
