import java.util.*;

public class Solution {
	public static String reverseWordWise(String s) {
		// Write your code here
		String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ",words);
	}
}
