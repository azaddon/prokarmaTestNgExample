package extentreports;
import extentreports.Screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest {

	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	String baseurl = "http://www.gmail.com";

	@BeforeMethod
	public void beforeClass() throws InterruptedException {

		report = new ExtentReports("C:\\Users\\kmohd\\Desktop\\ExtentReport.html");
		test = report.startTest("verifying login and logout functionality");
	}

	// driver.findElement(By.xpath("//*[@id=\"profileIdentifier\"]")).click();
	// driver.findElement(By.xpath("//*[@id=\"identifierLink\"]/div[2]/p")).click();
	@Test
	public void test_validate_login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started......");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser maximized.....");
		driver.get(baseurl);
		test.log(LogStatus.INFO, "URL Launched......");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("incrediblefighterzz@gmail.com");
		test.log(LogStatus.INFO, "username entered......");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		test.log(LogStatus.INFO, "waiting for enter password......");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*/input[@name='password']")).sendKeys("electricalandit");
		test.log(LogStatus.INFO, "password entered......");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		test.log(LogStatus.PASS, "login successful......");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]")).click();
		test.log(LogStatus.INFO, "logging out process starting......");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		test.log(LogStatus.PASS, "logout successful......");
	}

	@AfterMethod
	public void tearDown() {
		report.endTest(test);
		report.flush();
	}
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshot.takeScreenshot(driver, testResult.getName());
			String imgpath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "usernameincorrect", imgpath);
		}

		report.endTest(test);
		report.flush();
	}
}
