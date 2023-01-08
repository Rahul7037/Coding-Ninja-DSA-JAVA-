
public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
		int c = 1;
		if(str.length()==0){
			return 0;
		}
		for(int i=0;i<str.length()-1;i++){
			char a = str.charAt(i);
			char b = str.charAt(i+1);
			if(a==' ' && b!=' '){
				c++;
			}
		}
		return c;
	}

}