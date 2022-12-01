package Myprojectdemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class managecookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		//get all cookies
		Set<Cookie> cookies =driver.manage().getCookies();
		System.out.println("These are all cookies :" +cookies);
		
		Cookie currcookie =driver.manage().getCookieNamed("AMCV_17EB401053DAF4840A490D4C%40AdobeOrg");
		System.out.println("cookiee name is :"+currcookie);
		
		//add new cookie
		Cookie newcookie = new Cookie("user", "Manojgaur");
		driver.manage().addCookie(newcookie);
	
		
		// delete methods
		driver.manage().deleteCookie(newcookie);
		
		driver.manage().deleteCookieNamed("user");
		
		driver.manage().deleteAllCookies();

	}

}
