package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver c = new ChromeDriver();
		
		c.get("http://www.echoecho.com/htmlforms10.htm");
		
		System.out.println(c.findElement(By.xpath("//input[@value='Milk']")).isSelected());

		c.findElement(By.xpath("//input[@value='Milk']")).click();		

		System.out.println(c.findElement(By.xpath("//input[@value='Milk']")).isSelected());
		
		System.out.println("number of options : "+c.findElements(By.name("group1")).size());
		
		int count = c.findElements(By.name("group1")).size();
		
		for(int i =0; i<count ; i++){
			
			c.findElements(By.name("group1")).get(i).click();
			
			System.out.println("clicked the opion: "+c.findElements(By.name("group1")).get(i).getAttribute("value"));
			String test = c.findElements(By.name("group1")).get(i).getAttribute("value");
			if(test.equals("Milk")){
			
				System.out.println("Success : "+c.findElements(By.name("group1")).get(i).getAttribute("value")+" was found and clicked !!");
			}
		}
		
		
		
		

	}

}
