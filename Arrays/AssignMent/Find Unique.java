1st Method


public class Solution{  

    public static int findUnique(int[] arr){
        
        int res = arr[0]; 
        for (int i = 1; i < arr.length; i++) 
            res = res ^ arr[i]; 
      
        return res; 
    }
}




2nd Method

import java.util.*;

public class Solution{  
  public static int findUnique(int[] arr){
		//Your code goes here

    HashSet<Integer> a = new HashSet<>();
    for(int i=0;i<arr.length;i++){
      a.add(arr[i]);
    }

    return a;
    }
}

