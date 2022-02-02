package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		  /*String userID="mngr381708";
		  String password1="mehujAs";*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yeasi\\OneDrive\\Desktop\\Automation Framwaork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mngr381708");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mehujAs");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		System.out.println(driver.getTitle());
		
		
		
		/*gdpr-consent-notice
		faktor-iframe-wrapper*/
		
		driver.quit(); 
		
		
		

	}

}
