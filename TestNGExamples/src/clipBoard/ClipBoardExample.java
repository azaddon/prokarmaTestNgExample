package clipBoard;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClipBoardExample {

	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
		String baseurl="https://www.w3schools.com/howto/tryit.asp?filename=tryhow_js_copy_clipboard2";
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.findElement(By.xpath("/html/body/div/button")).click();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		String result = (String) clipboard.getData(DataFlavor.stringFlavor);
		System.out.println("String from Clipboard:" + result);
		WebElement elem =driver.findElement(By.xpath("//input[@id='myInput']"));
		String reallength =elem.getAttribute("maxlength");
		System.out.println(reallength);
		int sizeOfReallength = reallength.length();
		System.out.println(sizeOfReallength);
		
	}

}
