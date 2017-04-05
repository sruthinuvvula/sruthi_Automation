package DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test(dataProvider="MyRepo")
	public void Browser(String name, String age, String id){
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);	
		System.out.println();
	}
	
	@DataProvider
	public Object[][] MyRepo(){
		Object[][] data = new Object[3][3];
		//i stands for number of times testcase should run
		//j stands for no of parametrs it should send for one go
		data[0][0]="mukesh";
		data[0][1]="24";
		data[0][2]="a1122";
		
		data[1][0]="sruthi";
		data[1][1]="23";
		data[1][2]="b3344";
		
		data[2][0]="buddi";
		data[2][1]="1";
		data[2][2]="c5566";
		
		return data;
		
		
	}
	
	

}
