package assertTest;
// doing some changes to reflect in git repository

//doing additional changes
//doing another changes to test git command

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {

	@Test
	public void HardAssert() {
		
		System.out.println("Hard Assert Method starting");
		int sum = 4+6;
		Assert.assertEquals(9, sum);
		System.out.println("Hard Assert Completed with sum displayed as "+ sum );
	}
	
	@Test
	public void SoftAssert() {
		System.out.println("Soft Assert about to Start..");
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("Soft Assert Starting");
		int sum = 5+6;
		softAssertion.assertEquals(10,sum);
		System.out.println("soft assertion completed");
		softAssertion.assertAll();
	}
}
