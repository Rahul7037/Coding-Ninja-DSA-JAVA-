
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int first = 0;
        int last = arr.length -1;
       

        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]<x){
                first = mid+1;
            }
            else if(arr[mid]==x){
                return mid;
            }
            else{
                last = mid-1;
            }
            mid = (first+last)/2;
        }
        return -1;
    }

}