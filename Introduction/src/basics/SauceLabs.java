package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLabs {
	@Test
public void setup() throws MalformedURLException
{
	DesiredCapabilities dc= DesiredCapabilities.firefox();
	
	dc.setCapability("version", "5");
	
	dc.setCapability("platform", "xp");

	WebDriver driver = new RemoteWebDriver(new URL("http://gattumukesh14:223831f2-3cee-4e0b-a61d-0d1c2a68e8d3@ondemand.saucelabs.com:80/wd/hub"),dc);

	driver.get("http://www.makemytrip.com/");
	
	driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
	
	driver.findElement(By.linkText("Hyderabad, India (HYD)")).click();
	
	
	
}   //http://saucelabid:Accesskey@ondemand.saucelabs.com:80/wd/hub
	
	
}
