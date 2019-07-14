package samplewindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcsec.com/");
		Thread.sleep(5000);
		   driver.findElement(By.xpath("//a[text()='login']")).click();
		   String mainWindow = driver.getWindowHandle();
		   Set<String> windows =driver.getWindowHandles();
		   System.out.println( "*** "+windows.size());

		   for(String window:windows) {
		     if (window != mainWindow) {
		       driver.switchTo().window(window);
		       System.out.println("*** " + driver.getTitle());
		     }
		   }
		     driver.switchTo().window(mainWindow);
		   System.out.println("*** "+driver.getTitle());
		
	}

}
