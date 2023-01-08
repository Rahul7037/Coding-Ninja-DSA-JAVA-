
public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
		String r = "";
		for(int i=str.length();i>0;--i){
			//char b[] = str.toCharArray();
			r=r+(str.charAt(i-1));
		}
		return r;
	}
}