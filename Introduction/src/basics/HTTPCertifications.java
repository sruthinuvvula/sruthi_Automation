package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HTTPCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxProfile p = new FirefoxProfile();
		
		p.setAcceptUntrustedCertificates(false);
		
		WebDriver f = new FirefoxDriver(p);
		
		f.manage().deleteAllCookies();
		
		f.manage().window().maximize();
		
		f.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		
		
	}

}
