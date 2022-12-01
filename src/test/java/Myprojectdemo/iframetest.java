package Myprojectdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Lists;

public class iframetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		driver.get("http://magnus.jalatechnologies.com/");
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[11]/a")).click();
		Thread.sleep(1000);
		
		List<WebElement> iframeele  = driver.findElements(By.tagName("iframe"));
		System.out.println("The size of iframe is :" +iframeele.size());
		
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[1]/a")).click();
		
		driver.quit();
		
		
		

	}

}
