package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();
		
		c.get("http://www.makemytrip.com/");
		
		c.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		
		c.findElement(By.linkText("Hyderabad, India (HYD)")).click();
		
		
		
		
		
	}

}
