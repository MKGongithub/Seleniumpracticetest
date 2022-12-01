package Myprojectdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mbajp\\OneDrive\\Desktop\\new testing tools\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //open url
        driver.get("https://demoqa.com/browser-windows");

        //max
        driver.manage().window().maximize();

	}

}
