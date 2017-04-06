package Basics02Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		
		WebDriver c= new ChromeDriver();
		
		c.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
		
		c.get("http://www.spicejet.com/");
		c.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		c.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		c.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[7]/a")).click();
		c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")).click();
		c.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[3]/li[5]/a)[2]")).click();// mumbai xpath
		c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[4]/a")).click();
		
		Select s= new Select(c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByIndex(4);
		Select s1= new Select(c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		s1.selectByValue("2");
		
		c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']/option[5]")).click();
		c.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();		
		c.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).sendKeys(Keys.TAB);
			
		
		WebDriverWait d = new WebDriverWait(c, 20);//explicit wait
		
		d.until(ExpectedConditions.elementToBeClickable(c.findElement(By.xpath("//*[@id='footer']/div/div[2]/ul/li[4]/a"))));//explicit wait
		
		
		System.out.println("found element !");
		
		c.findElement(By.xpath("//*[@id='footer']/div/div[2]/ul/li[4]/a")).click();
		
		
		//Thread.sleep(3000l);
		c.close();
		
	}

}
