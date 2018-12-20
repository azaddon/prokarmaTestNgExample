package tests;
//adding to git
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl ="http://www.gmail.com";
		driver.get(baseurl);
		//driver.findElement(By.xpath("//*[@id=\"profileIdentifier\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"identifierLink\"]/div[2]/p")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("incrediblefighterzz@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*/input[@name='password']")).sendKeys("electricalandit");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		System.out.println("login passed");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		System.out.println("logout successful");
	}

}
