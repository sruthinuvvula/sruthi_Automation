package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuggestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver", "C://Users//mukesh//Downloads//geckodriver-v0.15.0-win64//geckodriver.exe");
		
		WebDriver f = new ChromeDriver();
		
		f.get("https://www.yahoo.com/");
		//shread.sleep();
		f.findElement(By.id("uh-search-box")).sendKeys("pet car");
		
		WebDriverWait w = new WebDriverWait(f,4);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("yui3-aclist-list")));
		
		System.out.println("here..");
		
		f.findElement(By.xpath("//*[@id='uh-assist-link-5']")).click();
		
		
	}

}
