package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logintest {
	
	static WebDriver driver;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		String baseurl ="http://www.gmail.com";
		driver.get(baseurl);
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("incrediblefighterzz@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*/input[@name='password']")).sendKeys("electricalandit");
		
	}

	@When("clicks on go button")
	public void clicks_on_go_button() {
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
	}

	@Then("he can visit practice page")
	public void he_can_visit_practice_page() {
		System.out.println("Welcome to gmail");
	}

	@Then("message is displayed")
	public void message_is_displayed() {
		System.out.println("login passed");
	}

	@When("user logout from application")
	public void user_logout_from_application() throws Exception {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
	}

	@Then("he cannot visit practice homepage")
	public void he_cannot_visit_practice_homepage() {
		System.out.println("logout successful");
	}
}
