import java.util.*;
public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
       int largest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}