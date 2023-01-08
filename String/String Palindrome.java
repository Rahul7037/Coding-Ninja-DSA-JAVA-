
public class Solution {

	public static boolean isPalindrome(String str) {
		//Your code goes here
		int start = 0;
		int end = str.length()-1;
		if(start == end){
			return true;
		}
		while(start<end){
			char[] ch = str.toCharArray();
			if(ch[start]!=ch[end]){
				return false;
			}
			if(ch[start]==ch[end]){
				start++;
				end--;
				return true;
			}
		}
		return false;
	}

}