package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver c = new ChromeDriver();
		
		c.get("http://www.ebay.com/");
		
		c.manage().window().maximize();
		
		System.out.println("Links in Page");
		
		System.out.println(c.findElements(By.tagName("a")).size());
		
		WebElement w = c.findElement(By.id("glbfooter"));
		
		System.out.println("links in Footer");
		
		System.out.println(w.findElements(By.tagName("a")).size());
		
		WebElement w2 = c.findElement(By.id("gh"));
		
		System.out.println("links in header");
		
		System.out.println(w2.findElements(By.tagName("a")).size());
		

		//======================
		
		WebElement column = c.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		
		int column_size = column.findElements(By.tagName("a")).size();
		
		System.out.println("No. of links in column: "+column_size);
		
		String parent_link = c.getTitle();
				
		String child_link = null;
		
		System.out.println();
		
		System.out.println(c.getTitle());
		
		for(int i=0; i<column_size; i++){
			
			System.out.println(column.findElements(By.tagName("a")).get(i).getText());
			
			String str = column.findElements(By.tagName("a")).get(i).getText();
			
			if(str.equals("Site map")){
				
				System.out.println("found the link to : " +str);
				
				column.findElements(By.tagName("a")).get(i).click();
				
				child_link = c.getTitle();
				
				break;
			}
			
		}
		
		System.out.println();
		
		System.out.println(c.getTitle());
		
		if(parent_link!=child_link){
			
			System.out.println("Navigation Pass");
			
		}
		else{
			
			System.out.println("Navigation Failed");
		
		}
		
		System.out.println();
		
		System.out.println("Navigated to SiteMap : " +c.getPageSource().contains("Sitemap"));
		
		
		Thread.sleep(3000l);
		
		c.quit();
		
	}

}
