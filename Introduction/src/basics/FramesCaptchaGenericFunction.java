package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCaptchaGenericFunction {

	
		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
			
			WebDriver c = new ChromeDriver();
			
			c.get("https://www.google.com/recaptcha/api2/demo");
			
			c.manage().window().maximize();			
			
			//WebElement w = c.findElement(By.className("recaptcha-checkbox-checkmark"));
		
			//By str = "recaptcha-checbox-checkmark";
			
			By w1 =By.className("recaptcha-checkbox-checkmark");
			
			int k = FindFrame(c, w1) ;				
			
			if(k >= 0){
				
				c.switchTo().frame(k);
				
				c.findElement(w1).click();

			}
			else{
				
				System.out.println("Element was not found in any frame");
				
			}	
			
			Thread.sleep(3000l);
			
			//second click functionality
			c.switchTo().defaultContent();
			
			By w2 = By.id("recaptcha-verify-button");
			
			int k2 = FindFrame(c, w2) ;				
			
			if(k2 >= 0){
				
				c.switchTo().frame(k2);
				
				c.findElement(w2).click();

			}
			else{
				
				System.out.println("Element was not found in any frame");
				
			}	
			
			
			
		}		
		
//Method=================================================================================================
		
		public static int FindFrame(WebDriver c,By w){
	
			int TotalFramecount = c.findElements(By.tagName("iframe")).size();
			
			int FrameNumber = 0 ;
			
			System.out.println("Total Frames in the page : "+TotalFramecount);
			
			int j = 0;
			
			for(int i=0; i<TotalFramecount; i++){
				
				c.switchTo().frame(i);
				//------
				//System.out.println("here..3");				
				
				j= c.findElements(w).size();
				
				if(j > 0){
					
					System.out.println("found in Frame no : "+i);
					
					FrameNumber = i;
					
					break;
				}
				else{
					
				System.out.println("Unable to find element ");
				
				FrameNumber = -1;				
				
				}
				
				System.out.println("FrameNumber Value: "+FrameNumber);
				
				c.switchTo().defaultContent();
			}
			
			c.switchTo().defaultContent();
			
			return FrameNumber;
	
			}
		
}




