package Myprojectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizenadlocationonwebele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jalaacademy.com/#");
		
		 WebElement logoweb=driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[4]/div/a[1]/img"));
		
		 
		 //location of webele method 1 in x,y axes
		 System.out.println("The location of (x,y)"+logoweb.getLocation());
		 System.out.println("The location of (x)"+logoweb.getLocation().getX());
		 System.out.println("The location of (y)"+logoweb.getLocation().getY());

		 //location of webele method 2 in x,y axes
		 System.out.println("The location of (x)"+logoweb.getRect().getX());
		 System.out.println("The location of (y)"+logoweb.getRect().getY());
		 
		 
		//size of webele method 1 inheight and width
		 System.out.println("The size of (h,w)"+logoweb.getSize());
		 System.out.println("The size of (h)"+logoweb.getSize().getHeight());
		 System.out.println("The size of (w)"+logoweb.getSize().getWidth());
		 
		 driver.close();
	}
	

}
