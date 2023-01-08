public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int c =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[c++]=arr[i];
            }
        }
        for(int i=c;i<arr.length-1;i++){
            arr[i]=0;
        }

    }

}