
public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String a = "";
		for(int i=0;i<str.length();i++){
			char b[] = str.toCharArray();
			if(b[i]!=ch){
				a+=b[i];
			}
		}
		return a;
	}

}