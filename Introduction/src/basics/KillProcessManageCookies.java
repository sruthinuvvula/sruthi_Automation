package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

import com.sun.jna.platform.WindowUtils;

public class KillProcessManageCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver w = new ChromeDriver();
		
		 w.get("http:/google.com/");
		//WindowsUtils.killByName("notepad.exe"); //Process killing
		
		Set<Cookie> set1 = w.manage().getCookies();
		
		System.out.println("Before deleting, Cookies in the page: "+set1.size());
		
		w.manage().deleteAllCookies();
		
		Set<Cookie> set2 = w.manage().getCookies();
		
		System.out.println("After Deleting, Cookies in the page: "+set2.size());
		
		
		
		

	}

}
