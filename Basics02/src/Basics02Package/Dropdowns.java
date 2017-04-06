package Basics02Package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();
		
		c.get("http://www.spicejet.com/");
		
		c.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		Thread.sleep(2000l);
		
		c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		
		c.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		c.findElement(By.cssSelector("span[id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")).click();
			
		c.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a)[2]")).click();
		
		Thread.sleep(2000l);
		
		//c.findElement(By.xpath("//*[@id='flightSearchContainer']/div[3]/button")).click();
				
		c.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();
		
		//c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")).click();
		
		c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']/option[4]")).click();
		
		Select child = new Select(c.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		
		child.selectByIndex(2);
		
		c.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']/option[4]")).click();
		
		c.findElement(By.xpath("//*[@id='StudentDiv']/label")).click();
		
		Actions a = new Actions(c);

		c.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
	//	a.moveToElement(c.findElement(By.xpath("//*[@id='flightSearchContainer']/div[5]/p[3]"))).click();
		
		c.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
				
		Thread.sleep(3000l);
		
		//c.close();
		
		
		
	}

}
