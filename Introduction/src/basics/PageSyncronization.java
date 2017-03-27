package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSyncronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver c = new ChromeDriver();
		
		c.get("https://www.amazon.com/");
		
		//c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		c.findElement(By.partialLinkText("Video")).click();
		
		c.findElement(By.partialLinkText("Reload Your Balance")).click();
	}

}
