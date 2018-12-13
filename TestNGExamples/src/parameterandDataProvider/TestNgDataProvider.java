package parameterandDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
	
	@DataProvider(name="Addition")
	
	public static Object[][] Numbers(){
		
		return new Object[][] {{4,5} , {7,8}};
	}
	
	@Test(dataProvider= "Addition")
	public void Test004(int FirstNum, int SecondNum){
		
		int sum = FirstNum+SecondNum;
		System.out.println(sum);
		
	}

}
