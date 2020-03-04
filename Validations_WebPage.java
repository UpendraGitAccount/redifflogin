package rediff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_WebPage {
public static WebDriver driver;
	public static void main(String[] args) {
		//getTitle();    ,     getCurrentUrl();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		System.out.println(driver.getTitle());
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
         String expectedTitle =  driver.getTitle();
         if(expectedTitle.equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")) {
        	 System.out.println("This is the correct landing page of Rediff");
         }else {
        	 System.out.println("this is incorrect landing page of Rediff");
         }
         
         if(expectedTitle.equals(actualTitle)) {
        	 System.out.println("This is the correct landing page of Rediff");
         }else {
        	 System.out.println("This is the incorrect landing page of Rediff");
         }
	}

}
