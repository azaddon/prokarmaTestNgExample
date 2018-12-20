package cssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementwithCSS {

	WebDriver driver;
	String baseurl ="https://www.appliedaicourse.com/";
	
	@BeforeTest
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(baseurl);
	}
	/*@Test
	public void HomePage() {
	
		driver.get(baseurl);
	}*/
	@Test
	public void LoginTest_CSS() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a.login")).click();
	}
	@AfterTest
	public void CloseBrowswer() {
		System.out.println("Test Complete");
	}
}
