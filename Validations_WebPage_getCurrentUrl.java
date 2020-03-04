package rediff;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_WebPage_getCurrentUrl {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.className("signin")).click();
		System.out.println("******************CurrentUrl*********************************************");
		System.out.println(driver.getCurrentUrl());
         String actualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
         String expectedCurrentUrl = driver.getCurrentUrl();
         if(expectedCurrentUrl.equals(actualCurrentUrl)) {
        	 System.out.println("This is the correct currentURL of Rediff Login Page");
         }else 
         {System.out.println("This is the incorrect currentURL of Rediff Login Page");
        	  }
         System.out.println("******************Title*********************************************");
         System.out.println(driver.getTitle());
         String actutalTitle = "Rediffmail";
         String expectedTitle = driver.getTitle();
         if(expectedTitle.equals(actutalTitle)) {
        	 System.out.println("This is the correct title of Rediff Login page");
         }else {
        	 System.out.println("This is the incorrect title of Rediff Login Page");
         }
	}

}
