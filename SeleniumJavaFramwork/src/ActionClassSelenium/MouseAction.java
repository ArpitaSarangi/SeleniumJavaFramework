package ActionClassSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MouseAction {
	
	@Test
	public static void performMouseHover() {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testsigma.com/");
			
		WebElement solutions=driver.findElement(By.xpath("//p[contains(text(),'Solutions')]"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(solutions).build().perform();
		
		System.out.println("Done");	
		driver.quit();
	}
	
	public static void mouseDoubleClick() {
		ChromeOptions option=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions action=new Actions(driver);
		action.doubleClick(doubleClick).build().perform();
		System.out.println("Executed");
		driver.quit();
	}
	
	public static void dragAndDrop() {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));		
		WebElement target=driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		System.out.println("Executed");
		
		driver.quit();
		
	}
	
	public static void scrollToElement() {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		
		WebElement newLetter=driver.findElement(By.xpath("//a[contains(text(),'Newsletter')]"));
		
		Actions action=new Actions(driver);
		action.scrollToElement(newLetter).build().perform();
		newLetter.click();
		
		System.out.println("Executed");
		driver.quit();
	}
	
	
	public static void sendKeysTest() {
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchtext=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		Actions action=new Actions(driver);
		action.sendKeys(searchtext,"selenium").build().perform();
	
		System.out.println("searched");
		driver.quit();
	}
	
	
	
	

	public static void main(String[] args) {
		MouseAction.performMouseHover();
		System.out.println("Method performMouseHover executed");
		MouseAction.mouseDoubleClick();
		System.out.println("Method mouseDoubleClick executed");	
		MouseAction.dragAndDrop();
		System.out.println("Method Drag & Drop Executed");
		MouseAction.scrollToElement();
		System.out.println("Method scrollTo Element");
		MouseAction.sendKeysTest();
		System.out.println("Method sendkeysTest executed");
		
	}

}
