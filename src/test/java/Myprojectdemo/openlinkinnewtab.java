package Myprojectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class openlinkinnewtab {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magnus.jalatechnologies.com/");
	
	
	//opennin new tab
	driver.switchTo().newWindow(WindowType.TAB);
	
	//open in new  window
	
	//for( int i = 1; i<=3;i++) {
		
	//driver.switchTo().newWindow(WindowType.WINDOW);
	
	//driver.get("https://magnus.jalatechnologies.com/");

	//}
	driver.get("https://www.flipkart.com/");
	
	
	//open new tab method2
//	String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
//	
//	driver.findElement(By.linkText("Admin Login")).sendKeys(tab);

}
}
