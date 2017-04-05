package testNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterss {
	
	@Test
	@Parameters({"mukesh"})
	public void Browser(String name){
		System.out.println(name);
		System.out.println();
	}

}
