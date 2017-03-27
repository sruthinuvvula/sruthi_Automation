package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestWithFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();
		
		c.get("https://www.google.com/?gws_rd=ssl");
				
		c.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("pet ca");		
	
		WebDriverWait wd = new WebDriverWait(c, 5);
		
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul")));
		
		System.out.println("here..1");
		
		c.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[2]")).click();
	
		c.quit();
	}

}
