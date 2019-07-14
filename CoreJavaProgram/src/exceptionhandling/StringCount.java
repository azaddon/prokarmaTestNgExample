package exceptionhandling;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="PROGRAMMING";
		Map<Character,Integer> chartocount=new HashMap<>();
		for(Character c: s1.toCharArray()) {
			if(chartocount.containsKey(c)) {
				chartocount.put(c, chartocount.get(c)+1);
			}
				else{
					chartocount.put(c, 1);
				}
			}
		System.out.println(chartocount);
		}
	}


