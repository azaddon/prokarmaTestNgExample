package eventListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WDEListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseurl = "https://www.expedia.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		HandleEvents he =new HandleEvents();
		edriver.register(he);
		edriver.get(baseurl);
		edriver.findElement(By.id("tab-flight-tab")).click();
	}

}
