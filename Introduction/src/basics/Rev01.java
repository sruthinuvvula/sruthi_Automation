package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rev01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("http://www.ebay.com/");
		//System.out.println(c.getClass());
		//System.out.println(c.getWindowHandle());
		
		int i = c.findElements(By.tagName("a")).size();
		System.out.println(i);
		
		Thread.sleep(3000l);
		c.close();
	}

}
