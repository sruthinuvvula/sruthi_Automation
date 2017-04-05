/*package testNG;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsTestNG {
	
	@org.testng.annotations.BeforeTest
	public void Samplebefore(){
		System.out.println("test1");
	}
	
	
	@Test(groups = "priority1")
	public void sample(){
		System.out.println("sample");
	}
	
	@AfterTest
	public void Sampleafter(){
		System.out.println("test1");
	}
	
	
	@BeforeMethod
	public void Before(){
		System.out.println("Before Method");
	}
	@Test
	public void first(){
		System.out.println("Executing First ");
		System.out.println();
	}
	
	@Test
	public void Second(){
		System.out.println("Executing Second ");
	}
	
	@Test
	public void Third(){
		System.out.println("Executing Third ");
		System.out.println();
	}
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest(){
		System.out.println("Executing Before Test ");
		System.out.println();
	}
	
	@AfterTest
	public void AfterTest(){
		System.out.println("Executing After Test ");
		System.out.println();
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("Executing Before Test ");
		System.out.println();
	}

	@AfterMethod
	public void AfterMethod(){
		System.out.println("Executing After Method ");
		System.out.println();
	}
	
	@Test(groups = "priority1")
	public void FoolProof1(){
		System.out.println("Fools Proof 1");
	}
	
	@Test(groups = "priority2")
	public void FoolProof2(){
		System.out.println("Fools Proof 2");
	}
	
	@Test(groups = "prioritilu")
	public void FoolProof3(){
		System.out.println("Fools Proofulu ");
	}
	
	/*
	@BeforeSuite
	public void BeforeSuite(){
		System.out.println("Executing Before Suite ");
		System.out.println();
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("Executing After Suite ");
		System.out.println();
	}
	
	
}*/
