
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int start = 0;
        int end = n-1;
        int i=1;
        int j=2;
        while(start<end){
            arr[start] = i;
            i+=2;
            arr[end] = j;
            j+=2;

            start++;
            end--;
           
        }
        if(start == end){
            arr[start] = n;
        }
    }
}