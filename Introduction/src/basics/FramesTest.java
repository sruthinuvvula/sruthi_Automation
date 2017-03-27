package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver c = new ChromeDriver();
		 
		 c.get("https://jqueryui.com/droppable/");
		 
		 c.switchTo().frame(c.findElement(By.className("demo-frame")));
				 
		 Actions s = new Actions(c);		 
		 
		 WebElement source = c.findElement(By.id("draggable"));
		 
		 WebElement target =c.findElement(By.id("droppable"));
		 		 
		 s.dragAndDrop(source, target).build().perform();
		 		 		 
		// s.moveToElement(source).contextClick().build().perform();
		 
		 System.out.println("here");
				
		c.switchTo().defaultContent();
		
	}

}
