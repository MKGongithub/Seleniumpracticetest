package Myprojectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionvsActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login");
		
		WebElement webele = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"));
		
		
		Actions act = new Actions(driver);
		//act.moveToElement(webele).perform(); // use mouse on elememt 
		
		//act.moveToElement(webele).build().perform();//inthis build meth is calling 2 times but no change
		

		
		// actions is a class and action is interface 
		// inside perform , internally build is also calling 
		// build is only returns action only
		
		
		// or we can write above code by action interface
		
		Action acti =  act.moveToElement(webele).build();
		acti.perform();
	}
	
	

}
