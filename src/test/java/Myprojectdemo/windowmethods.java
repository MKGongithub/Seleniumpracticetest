package Myprojectdemo;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		
		//maximize wiindow
		driver.manage().window().maximize();
		
		//fullscreen
		driver.manage().window().fullscreen();
		
		//get position of window
		Point point = driver.manage().window().getPosition();
		System.out.println(point.x);
		System.out.println(point.y);

		
		//set window position
		
		Point point1 = new Point(10, 10);
		System.out.println(point1);
		
		
		//set size of window
		
		Dimension dimension = new Dimension(200, 300);
		driver.manage().window().setSize(dimension);
		
		
		

	}

}
