package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Base {
	
	static WebDriver c;
	@Test
	public static void Login() throws IOException{
		
		Properties prop = new Properties();
		
		FileInputStream fippo = new FileInputStream("C:\\Users\\mukesh\\git\\sruthi_Automation\\Introduction\\myfile.properties");
		
		prop.load(fippo);
		
		
		
		if(prop.getProperty("browser").contains("chrome"))
		{
		
			c = new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equals("firefox")){
			
			c=new FirefoxDriver();
						
		}else{
			
			c=new InternetExplorerDriver();
		}
	
		c.get(prop.getProperty("url"));
		
		System.out.println("In Base Class ");
		
	}
	
	
	

}
