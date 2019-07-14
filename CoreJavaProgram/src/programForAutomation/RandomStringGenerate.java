package programForAutomation;

public class RandomStringGenerate {
	public static void main(String[] args) {
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"+"!@#$%^&*()_+=-/?.>,<`~"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(); 
  
        for (int i = 0; i < 2000; i++) { 
  
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
        System.out.println(s1);
        System.out.println(s1.length());
    } 
	
	}
   /* public static void main(String[] args) 
    { 
  
        // Get the size n 
        int n = 2000; 
  
        // Get and display the alphanumeric string 
        System.out.println(RandomStringGenerate.getAlphaNumericString(n)); 
    } */


