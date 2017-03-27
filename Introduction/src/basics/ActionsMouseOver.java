package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver c = new ChromeDriver();
		
		c.get("https://www.amazon.com/ref=nav_logo");
		
		Actions a = new Actions(c);
		
		a.moveToElement(c.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		WebElement target = c.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		target.click();
		
		target.sendKeys("hello");
		
		a.moveToElement(target).click().keyDown(Keys.SHIFT).sendKeys("===hello capitals").keyUp(Keys.SHIFT).sendKeys("===smalls again").build().perform();
		
		a.moveToElement(target).doubleClick().build().perform();
		
		c.manage().window().maximize();
		
		a.moveToElement(target).contextClick().build().perform();
		
		Thread.sleep(3000l);
		
		System.out.println("waiting 3 seconds before shutting the browsers");
		
		c.quit();

	}

}
