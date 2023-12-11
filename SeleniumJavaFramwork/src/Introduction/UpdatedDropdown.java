package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);

		//driver.findElement(By.id("hrefIncAdt")).click();//2adults
		//driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		/*int i=1;
		while(i<5) {

			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
			i++;

		}*/
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times

		}


		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
	}

}