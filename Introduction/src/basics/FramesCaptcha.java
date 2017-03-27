package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCaptcha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver c = new ChromeDriver();
		
		c.get("https://www.google.com/recaptcha/api2/demo");
		
		c.manage().window().maximize();
		
		int frame_count = c.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total no.of frames in the page: "+c.findElements(By.tagName("iframe")).size());
		
		//c.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();
		
		//WebElement w = c.findElement(By.className("recaptcha-checkbox-checkmark"));
		
		//List<WebElement> list2 = c.findElements(By.tagName("iframe"));
		
		int element = 0;
		
		for(int i=0; i<frame_count; i++ ){
			
			c.switchTo().frame(i);	
			
			 element = c.findElements(By.className("recaptcha-checkbox-checkmark")).size();
			
			if(element > 0){
			
			c.findElement(By.className("recaptcha-checkbox-checkmark")).click();
			
			System.out.println("Success !");
			
			System.out.println("frame number of the desired element: "+i);
			
			break;
			
			}
			
			System.out.println("frame number : "+i);
				
				c.switchTo().defaultContent();	
		}
		
		c.switchTo().defaultContent();
		
		System.out.println("=====================================");
		
		Thread.sleep(2000l);
		
			int element2 =0;
			
		for(int j=0; j<frame_count; j++){
			
			c.switchTo().frame(j);
			
			element2 = c.findElements(By.id("recaptcha-verify-button")).size();
			
			if(element2 > 0){
				
				c.findElement(By.id("recaptcha-verify-button")).click();
				
				System.out.println("Cliked Verify Button !");
				
				System.out.println("frame number of the desired element: "+j);
				
						break;		
			}
			
			System.out.println("frame number : "+j);
			
			c.switchTo().defaultContent();
			
		}
		
		
		Thread.sleep(3000l);
		
		c.quit();
		
		
		
		

	}

}
