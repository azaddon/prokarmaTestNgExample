package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		
		String Path ="C:\\Users\\kmohd\\Desktop\\SampleGitProject\\prokarmaTestNgExample\\CoreJavaProgram\\src\\exceptionhandling\\Test.properties";

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(Path);
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
	}

}
