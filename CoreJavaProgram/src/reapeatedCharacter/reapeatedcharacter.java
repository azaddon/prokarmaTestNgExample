package reapeatedCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reapeatedcharacter {
	public static void main(String[] args) {
		char stringchar;
		// TODO Auto-generated method stub
	Scanner scanner= new Scanner(System.in);
		String charToCount =scanner.nextLine();
		char[] CountChar=charToCount.toCharArray();
		Map<Character,Integer> map =new HashMap<>();
		for(char c:CountChar) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
