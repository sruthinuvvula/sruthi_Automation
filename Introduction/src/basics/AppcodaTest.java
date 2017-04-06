package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppcodaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\Downloads\\geckodriver-v0.15.0-win64");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr73288");
		driver.findElement(By.name("password")).sendKeys("dEtUbUb");
		driver.findElement(By.name("btnLogin")).click();
	}

}
