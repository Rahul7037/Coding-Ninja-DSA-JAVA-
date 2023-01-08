import java.util.ArrayList;
public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            a.add(arr1[i]);
        }
         for(int i=0;i<arr2.length;i++){
            a.add(arr2[i]);
        }
       Collections.sort(a);
    }

}