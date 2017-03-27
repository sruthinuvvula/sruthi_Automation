package basics;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helloworld {
	public static void main(String[] args){
/*0	System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukesh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver c = new ChromeDriver();
	c.get("http://www.facebook.com");
	c.findElement(By.id("email")).sendKeys("buddi@gmail.com");
	c.findElement(By.id("pass")).sendKeys("m123456");
	c.findElement(By.id("u_0_q")).click();
	c.quit();
	System.setProperty("webdriver.gecko.driver", "C://Users/mukesh/Downloads/selenium-java-3.3.0/geckodriver-v0.15.0-win64/geckodriver.exe");
		WebDriver d = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver", "C://Users/mukesh/Downloads/selenium-java-3.3.0/geckodriver-v0.15.0-win64/geckodriver.exe");
		WebDriver d = new FirefoxDriver();
	d.get("http://www.facebook.com");
/*	d.findElement(By.id("email")).sendKeys("buddi@gmail.com");
	d.findElement(By.id("pass")).sendKeys("m123456");
	d.findElement(By.id("u_0_q")).click();
	d.quit();
	
	
	/*
 
 	d.findElement(By.id("u_0_1")).sendKeys("buddi");
	d.findElement(By.id("u_0_3")).sendKeys("gattu");
	d.findElement(By.id("u_0_6")).sendKeys("9712009293");
	d.findElement(By.id("u_0_d")).sendKeys("m9000678989");
	Select Sd=new Select(d.findElement(By.id("month")));

*/

	// <input id="email" class="inputtext" name="email" value="" tabindex="1" type="email"/>
		
		//System.setProperty("webdriver.gecko.driver", "C://Users/mukesh/Downloads/selenium-java-3.3.0/geckodriver-v0.15.0-win64/geckodriver.exe");
	//	WebDriver c = new FirefoxDriver();

		//System.setProperty("", value)
	
		WebDriver c= new ChromeDriver();
		c.get("http://www.spicejet.com");
	
		c.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	    c.findElement(By.cssSelector("a[value='DEL']")).click();
	    c.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	    
	    c.findElement(By.name("ctl00$mainContent$ddl_Adult")).click(); 
	
	
	
		
	}
}
