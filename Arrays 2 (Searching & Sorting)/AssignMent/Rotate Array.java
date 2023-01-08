
public class Solution {  
        static void rotate(int arr[], int d)
    {
  
        if (d == 0)
            return;
  
        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
  
    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
  

    // public static void rotate(int[] arr, int d) {
    // 	//Your code goes here
    //     int  k= 1;
    //     while(k<=d){
    //         int last= arr[0];
    //         for(int i=0;i<arr.length-1;i++){
    //             arr[i] = arr[i+1];
    //         }
    //         arr[arr.length-1] = last;
    //         k++;
    //     }
    // }

}