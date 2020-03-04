package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_isDisplayed_isEnabled_ {
	public static WebDriver driver;
	public static void main(String[] args) {
		//isDisplayed();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");	
		
		boolean redifflogo = driver.findElement(By.xpath("//input[@id = 'OAS_subsection']/following::span[1]")).isDisplayed();
		if(redifflogo == true) {
			System.out.println("RediffLogo is displayed");
		}else {
			System.out.println("RediffLogo is not displayed");
		}
		
		//isEnabled();
		 boolean signinlink = driver.findElement(By.xpath("//a[@class = 'signin']")).isEnabled();
         if(signinlink == true) {
        	 System.out.println("the signin link is enabled");
         }else {
        	 System.out.println("The signin link is not enabled");
         }
         
         //isSelected(); - radiobutton or a checkbox
         driver.findElement(By.className("signin")).click();
        boolean keepmesignedincheckbox =  driver.findElement(By.xpath("//input[@id = 'remember']")).isSelected();
        if(keepmesignedincheckbox == true) {
        	System.out.println("The checkbox is selected"); 	
        }else {
        	System.out.println("The checkbox is not selected");
        }
	}

}
