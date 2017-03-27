package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C://Users//mukesh//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver c = new ChromeDriver();
		
		c.get("http://www.spicejet.com/");
		
		Select s=new Select(c.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByVisibleText("5 Adults");
		s.selectByIndex(3);
		
		System.out.println(	c.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		c.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(	c.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
	}
	
}
