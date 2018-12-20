package testNGandReporter;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_ReportsANDLogs {
	
@BeforeClass
public void setUp() {
	System.out.println("testN_GReportsANDLogs-> this runs once before class");
	Reporter.log("testN_GReportsANDLogs-> this runs once before class",false);
}
@AfterClass
public void cleanUp() {
	System.out.println("testN_GReportsANDLogs-> this runs once after class");	
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("testN_GReportsANDLogs-> this runs before every method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("testN_GReportsANDLogs-> this runs after every method");
}
@Test
public void testMethod1() {
	Reporter.log("testN_GReportsANDLogs-> this runs testmethod1",true);
}
@Test
public void testMethod2() {
	Reporter.log("testN_GReportsANDLogs-> this runs testmethod2",true);
	Assert.assertTrue(false);
}
@Test(dependsOnMethods= {"testMethod2"})
public void testMethod3() {
	Reporter.log("testN_GReportsANDLogs-> testmetohd3",true);
}

}
