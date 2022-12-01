package Myprojectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		WebElement webeleu = driver.findElement(By.id("UserName"));
		webeleu.sendKeys("training@jalaacademy.com");
		
		WebElement webelep = driver.findElement(By.id("Password"));
		webelep.sendKeys("jobprogram");
		
		//WebElement webeleb = driver.findElement(By.id("btnLogin"));
		//webeleb.click();
		
		
		//clear username and pasword
		webeleu.clear();
		webelep.clear();
		
		//gettext returen value of attribute
		System.out.println("The attriribute value is " +webeleu.getAttribute("class"));
		
		//get text retuurns the value of inbetween inner text
		System.out.println("The attriribute value is " +webeleu.getText());
		driver.close();

	}

}
