
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class C1 {

	public static void main(String[] args) {
	//stem.setProperty("webdriver.chrome.driver", "D://SOFTWARES/chromedriver.exe");
		//bDriver driver=new ChromeDriver();
		
		String s="000110011001011";
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if((i!=s.length()-1) && (s.contains("1").equals(s.charAt(i+1))
				count++;	
			}
		else {
			(==s.charAt(i))
			}
		}
		
		String m="";
		for(int i=0;i<=count;i++) {
		m=m+"0";
		}
		System.out.println(m);
		
			
				
	}

}
