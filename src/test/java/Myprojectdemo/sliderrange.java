package Myprojectdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderrange {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webDriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		WebElement webeleu = driver.findElement(By.id("UserName"));
		webeleu.sendKeys("training@jalaacademy.com");
		
		WebElement webelep = driver.findElement(By.id("Password"));
		webelep.sendKeys("jobprogram");
		
		WebElement webeleb = driver.findElement(By.id("btnLogin"));
	     webeleb.click();
	     Thread.sleep(2000);
	     WebElement elemore=driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a"));
	     elemore.click();
	     Thread.sleep(1000);
	     WebElement eleslider =driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[6]/a"));
	     
	     eleslider.click();
	     
	    WebElement minscroll= driver.findElement(By.xpath("//*[@id=\"blue\"]/div[1]/div[4]"));
	    
	    System.out.println("The location of element is :" +minscroll.getLocation()); //find location of element in x,y dimention
	    System.out.println("The size(height nad width) of element is :" +minscroll.getSize());//get height and width of element
	    
	    
	    //using actions class draganddropby// use perform to action//and used actions class
	    Actions act = new Actions(driver);
	    act.dragAndDropBy(minscroll, 400, 0).perform();// in x axes only change not in  y use 
	    
	    System.out.println("The location of element is :" +minscroll.getLocation()); 
	    System.out.println("The size(height nad width) of element is :" +minscroll.getSize());
	    
	    
	    
	    
	    

	    
	    
	}

}
