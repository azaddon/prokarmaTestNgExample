package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "C://Users//kmohd//Desktop//report-demo.html";
		extent = new ExtentReports(Path, false);
		extent.addSystemInfo("Selenium Version", "2.52").addSystemInfo("Platform", "window 10");

		return extent;
	}
}
