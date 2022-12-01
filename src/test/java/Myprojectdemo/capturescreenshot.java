package Myprojectdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturescreenshot {

	private static final java.io.File New = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		/*
		 * TakesScreenshot ts =(TakesScreenshot)driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("C:\\Users\\mbajp\\OneDrive\\Desktop\\new selenium workspace\\homesc.png"
		 * );
		 * 
		 * FileUtils.copyFile(src,dest);
		 * 
		 * System.out.println("screenshot captured sussessfully"); driver.close();
		 */
		
		
		//screenshot of pertucular webelement
		
	WebElement loginboxsc=driver.findElement(By.xpath("/html/body/div[2]"));
		
	File src = loginboxsc.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\mbajp\\OneDrive\\Desktop\\new selenium workspace\\webelesc.png");
	
	FileUtils.copyFile(src,dest);
	System.out.println("screenshot captured sussessfully");
	
	driver.close();
	
	

	}

	private static void File(String string) {
		// TODO Auto-generated method stub
		
	}

}
