public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                count++;
 
            }

        }
        for (int i = 0; i < count; i++) {

            arr[i]=0;
        }
        for (int i = count; i < arr.length; i++) {

            arr[i]=1;
        }
    }
}