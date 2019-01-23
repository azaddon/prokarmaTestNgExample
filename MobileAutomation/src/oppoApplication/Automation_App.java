package oppoApplication;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation_App {
	
	DesiredCapabilities capabilities;
	RemoteWebDriver driver;
	AppiumDriverLocalService service;
	AppiumServiceBuilder builder;

   
    @BeforeTest
    public void beforeTest() throws FileNotFoundException, IOException,NullPointerException {
                    
                   /* String currentdir = System.getProperty("user.dir");
                    File dir = new File(currentdir);
                    String parentpath = dir.getPath();
                    parentpath = parentpath.replace('\\', '/');
                    
                    Properties properties = new Properties();
                    properties.load(new FileInputStream(parentpath+ "/src/config.properties"));*/

                   /* capabilities = new DesiredCapabilities();
                    capabilities.setCapability("deviceName", properties.getProperty("deviceName"));
                    capabilities.setCapability("platformVersion", properties.getProperty("platformVersion"));
                    capabilities.setCapability("platformName", properties.getProperty("platformName"));
                    capabilities.setCapability("appPackage", properties.getProperty("appPackage"));
                    capabilities.setCapability("appActivity", properties.getProperty("appActivity"));*/
    	
    	builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4723);
		builder.withCapabilities(capabilities);
		//Start the server with the builder
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
		System.out.println("appium started");
    	

    	            DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("platformName", "Android");
                    capabilities.setCapability("deviceName", "7774dc58");
                    capabilities.setCapability("platformVersion", "5.1.1");
                    capabilities.setCapability("app", "C:\\Users\\kmohd\\Desktop\\MMTS Train Timings_com.mmtstraintimings.apk");
                    capabilities.setCapability("browserName", "android");
                    //capabilities.setCapability("deviceOrientation", "portrait");
                    //capabilities.setCapability("appiumVersion", "1.5.3");
                    try {
                         driver = new  RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                    } catch (MalformedURLException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                    }
    }
    @Test
    public void perform() {
    	System.out.println("as per ");
    }



@AfterTest
public void afterTest() {
try {
Thread.sleep(50);
} catch (InterruptedException e) {
//TODO Auto-generated catch block
e.printStackTrace();
service.stop();
System.out.println("appium server stopped");
}
}
}