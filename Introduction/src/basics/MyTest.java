package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();
		
		c.get("https://gattumukesh.wixsite.com/motel6onseminary");
		
		c.manage().window().maximize();
		
		Thread.sleep(5000l);
		
	//	c.findElement(By.xpath("//*[@id='check-in']/wix-svg/svg")).click();
		
	//	c.findElement(By.id("check-out")).click();
		
		
		
		
		
		
	}

}
