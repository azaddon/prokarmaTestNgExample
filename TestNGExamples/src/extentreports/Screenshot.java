package extentreports;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {

		public static String takeScreenshot(WebDriver driver,String filename) throws IOException {
			filename = filename + ".png";
			String directory="C:\\Users\\kmohd\\Desktop";
			File sourceFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile,new File(directory+filename));
		    return directory+filename;	
		}
		
	}

