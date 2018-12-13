package tryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	
	@Test(retryAnalyzer=tryanalyzer.RetryAnalyzer.class)
	public void Test1() {
		int sum =2+2;
		Assert.assertEquals(5,sum);
	}
	@Test
	public void Test2() {
		int sum =3+3;
		Assert.assertEquals(6,sum);
	}

}
