import java.util.*;
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		HashSet<Character> a = new HashSet<>();
		char b[] = str.toCharArray();
		for(int i =0;i<str.length();i++){
			
			a.add(b[i]);
		}
		String c = String.valueOf(a);
		String k = c.toString();
		return k;
	}

}