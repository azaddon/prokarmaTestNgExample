package tryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test002 {

	@Test
	 public void Test1()
	 {
		int sum=4+5;
	 Assert.assertEquals(sum,9);
	 }
	 
	 @Test
	 public void Test2()
	 {
		 int sum =4+6;
	 Assert.assertEquals(sum,10);
	 }
}
