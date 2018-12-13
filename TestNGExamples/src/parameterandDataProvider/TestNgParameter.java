package parameterandDataProvider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {
	
	@Test
	@Parameters({"firstNum","SecondNum"})
	public void test003(int firstNum, int SecondNum) {
		
		int sum =firstNum+SecondNum;
		System.out.println(sum);
	}
	

}
