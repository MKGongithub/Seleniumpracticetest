package Myprojectdemo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouserighclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jalaacademy.com/#");
		
		//WebElement homebtn = driver.findElement(By.xpath("//*[@id=\"menu-item-9012\"]/a/span"));
		
		
		//Actions act = new Actions(driver);
		//act.contextClick(homebtn).perform(); //perform right click
		
		//selection through mouse actions 
		
		WebElement linkbtn = driver.findElement(By.xpath("//*[@id=\"menu-item-8439\"]/a/span"));
		
		WebElement brightlinkbtn = driver.findElement(By.xpath("//*[@id=\"menu-item-8474\"]/a"));

		Actions act = new Actions(driver);
		act.moveToElement(linkbtn).moveToElement(brightlinkbtn).click().perform();
		
		
		
	}

}
