package clipBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RestrictTextCount {
	/*static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    }*/ 
	public static void main(String[] args) {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"+"!@#$%^&*()_+=-/?.>,<`~"; 

// create StringBuffer size of AlphaNumericString 
StringBuilder sb = new StringBuilder(); 

for (int i = 0; i < 150; i++) { 

// generate a random number between 
// 0 to AlphaNumericString variable length 
int index 
= (int)(AlphaNumericString.length() 
    * Math.random()); 

// add Character one by one in end of sb 
sb.append(AlphaNumericString 
      .charAt(index)); 
} 

String s1=sb.toString(); 
		// TODO Auto-generated method stub
		String baseurl= "https://dequeuniversity.com/library/aria/counters/sf-characters-remaining";
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		WebElement Textbox=driver.findElement(By.xpath("//textarea[@id=\"message\"]"));
		WebElement helpText= driver.findElement(By.xpath("//div[@id=\"chars-remaining\"]"));
		Textbox.clear();
		 for (int i = 0; i < s1.length(); i++){
		        char c = s1.charAt(i);
		        String s = new StringBuilder().append(c).toString();
		        if(i==50||i==100||i==149) {
		        	System.out.println(helpText.getText());
		        	System.out.println(Textbox.getCssValue("border-color"));
		        }
		        Textbox.sendKeys(s);
		        
		        
		        
		    }    
		
				
		
	}

}
