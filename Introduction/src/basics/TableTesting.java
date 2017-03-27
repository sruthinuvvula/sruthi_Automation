package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();
		
		c.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement tabl = c.findElement(By.id("customers"));
		
		List<WebElement> list1 = tabl.findElements(By.tagName("tr"));
		
		System.out.println("total rows in table: "+list1.size());
		
		System.out.println("Names of rows in the Table");
		
		//Iterator<WebElement> iter = count.iterator();
		
		System.out.println();
		
		for(WebElement w : list1){
			
			System.out.println(w.findElements(By.tagName("td")).size());
			
		}
		
		System.out.println();
		
	}

}
