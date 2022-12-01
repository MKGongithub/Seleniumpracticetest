package Myprojectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class moduleassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Manojkumar");
		driver.findElement(By.id("input-lastname")).sendKeys("gaur");

		driver.findElement(By.id("input-email")).sendKeys("Manojkumar1234@gmail.com");

		driver.findElement(By.id("input-telephone")).sendKeys("9024253942");

		driver.findElement(By.id("input-password")).sendKeys("test123");

		driver.findElement(By.id("input-confirm")).sendKeys("test123");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		driver.switchTo().alert().sendKeys("Congratulations! Your new account has been successfully created!");

		
	}

}
