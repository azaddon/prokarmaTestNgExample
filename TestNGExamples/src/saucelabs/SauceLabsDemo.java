package saucelabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SauceLabsDemo {
	public static final String USERNAME = "azad007";
	public static final String ACCESS_KEY = "d8149136-f95f-4a49-82bc-7967dfa5a131";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		/**
		 * Goes to Sauce Lab's guinea-pig page and prints title
		 */

		driver.get("https://www.appliedaicourse.com/");
		System.out.println("title of page is: " + driver.getTitle());

		
	}

}
