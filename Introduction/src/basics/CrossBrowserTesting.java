package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		 
		 
		 
		 WebDriver driver; 
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 System.setProperty("webdriver.gecko.driver", "C://Users//mukesh//Downloads//geckodriver-v0.15.0-win64//geckodriver.exe");
		 
		 capabilities.setCapability(FirefoxDriver.BINARY,new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		
		
		 driver = new RemoteWebDriver(new URL("http://192.168.0.103:5566/wd/hub"), capabilities);
		 
		 driver.get("http://google.com");
		 
		 System.out.println(driver.getTitle());

 
 

	}

}
