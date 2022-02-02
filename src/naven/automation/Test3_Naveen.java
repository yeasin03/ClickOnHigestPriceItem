package naven.automation;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_Naveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yeasi\\OneDrive\\Desktop\\Automation Framwaork\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.findElementById("user-name").sendKeys("standard_user");
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementById("login-button").click();
		List <WebElement>price = driver.findElementsByXPath("//div[@class=\"inventory_item_price\"]");
		
		double[] hPrice = new double[price.size()]; 
		
		/*Take price into an array*/
		
		for (int i=0;i<price.size();i++) {
			String amount = price.get(i).getText();
			
			double amt = Integer.parseInt(amount.replaceAll("[^0-9]", "").toString());
			double cPrice=amt/100;
			hPrice[i]=cPrice;
			
			
		}
		
		double max = Integer.MIN_VALUE;
		
		/*Find max price from array*/
		for (int j=0;j<hPrice.length;j++)	
		{
			if (hPrice[j]>max)
			{
				max = hPrice[j];
			}
		}
		System.out.println(max);
		
		/*Perform Click Event on highest price item  */
		
		for (int i=0;i<price.size();i++) {
			String amount = price.get(i).getText();
			
			double amt = Integer.parseInt(amount.replaceAll("[^0-9]", "").toString());
			double cPrice=amt/100;
			
			if (cPrice==max) {
				driver.findElementsByXPath("//button[contains(text(),\"Add to cart\")]").get(i).click();
			}
			
			
		}
		
		

	}

}
