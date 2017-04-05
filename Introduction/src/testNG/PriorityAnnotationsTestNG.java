package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityAnnotationsTestNG {

	@Test(groups = "priority1")
	public void MyBrowser(){
		System.out.println("MyBrowser ");
		System.out.println("");
		System.out.println("");
	}
	
	@BeforeTest
	public void MyBrowserNext(){
		System.out.println("BeforeTest  ");
		System.out.println("");
		System.out.println("");
	}
	
	@Test(dependsOnMethods={"MyBrowser"},alwaysRun=true)
	public void MyBrowser23(){
		System.out.println("Depend23");
		System.out.println("");
		System.out.println("");
	}
	@Test(enabled=true)
	public void MyBrowser2(){
		System.out.println("MyBrowser 2");
		System.out.println("");
		System.out.println("");
	}
	
	@Test(timeOut=1)
	public void MyBrowser3(){
		System.out.println("MyBrowser 3");
		System.out.println("");
		System.out.println("");
	}
	
	
}
