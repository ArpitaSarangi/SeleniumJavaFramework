package ActionClassSelenium;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			driver.get("https://www.google.com/");
			
			//Locate search Box
			WebElement searchBox=driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium WebDriver");
			
			Thread.sleep(2000);
			
			//Find Dropdown suggestions dynamically
			List<WebElement> suggestions=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
			
			if(suggestions.isEmpty()) {
				throw new NoSuchElementException("No suggestions found");
				
			}
			
			
			
			//Select an option dynamically
			boolean optionFound=false;
			for(WebElement suggestion:suggestions) {
				if(suggestion.getText().contains("tutorial")) {
					suggestion.click();
					optionFound=true;
					break;
				}	
			}
			
			if(!optionFound) {
				throw new NoSuchElementException("Desired option not found");
			}
			
			System.out.println(" Successfully selected the desired option.");
			
		}catch(NoSuchElementException e) {
			System.out.println("Error :" +e.getMessage());
		}finally {
			driver.quit();
			System.out.println("Browser Closed");
		}
		

	}

}
