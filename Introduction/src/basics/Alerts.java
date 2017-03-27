package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();
		
		c.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		c.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		c.switchTo().alert().accept();
		
				
		c.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		System.out.println("Alert text:= "+c.switchTo().alert().getText());
		
		c.switchTo().alert().accept();
		
		
		
		
	}

}
