package string;

import java.util.Arrays;

public class CheckAnagram {
	
	static void isAnagram(String str1,String str2) {
		String s1=str1.replaceAll(" ", "");
		String s2=str2.replaceAll(" ", "");
		boolean status=true;
		if(s1.length()!=s2.length()) {
			System.out.println(s1+" "+s2+ " are not anagram");
			status=false;
		}
		else  {
			char[] ArrS1=s1.toLowerCase().toCharArray();
			char[] ArrS2=s2.toLowerCase().toCharArray();
			Arrays.sort(ArrS1);
			Arrays.sort(ArrS2);
			status=Arrays.equals(ArrS1, ArrS2);
		}
		if(status) {
			System.out.println(s1 +" and "+s2+ " are anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isAnagram("peek", "keep");
		isAnagram("india is country ", "indai si co untry");
		isAnagram("vnvlv", "ece cc");
	}
}
