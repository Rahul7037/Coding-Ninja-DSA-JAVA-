public class Solution {

	public static String getCompressedString(String str) {
		// Write your code here.
		String s = str.charAt(0)+"";
		int count = 1;
		for(int i =1;i<str.length();i++){
			char x = str.charAt(i);
			char y = str.charAt(i-1);
			if(x==y){
				count++;
			}
			else{
				if(count>1){
					s += count;
					count=1;
				}
				s+=x;
			}
		}
		if(count>1){
			s += count;
			count=1;
		}

		return s;

	}

}