
public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
        for(int s=0;s<str.length();s++){
            for(int e=s;e<str.length();e++){
                System.out.println(str.substring(s,e+1));
            }
        }
	}
}