package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver c = new ChromeDriver();
		
		c.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.com%2Fwebhp%3Fsourceid%3Dchrome-instant%26ion%3D1%26espv%3D2%26ie%3DUTF-8&hl=en");
		
		c.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		System.out.println("current title : "+c.getTitle());
		
		Set<String> s = c.getWindowHandles();
		
		Iterator<String> iter = s.iterator();
		
		String parent = iter.next();
		
		String child = iter.next();
		
		System.out.println("current title : "+c.getTitle());
		
		c.switchTo().window(child);
		
		System.out.println("current title : "+c.getTitle());
		

	}

}
