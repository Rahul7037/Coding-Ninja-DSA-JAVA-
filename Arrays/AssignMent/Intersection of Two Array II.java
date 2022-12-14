1st Method


public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        //int arr[]= new int{};
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
    }
}





2nd Method 


import java.util.*;
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        HashSet<Integer> set1 = new HashSet();
     
     //Traverse an array, put each element in a set
     for(int i=0;i<arr1.length;i++){
       set1.add(arr1[i]);
     }
     for(int j=0;j<arr2.length;j++){
       if(set1.contains(arr2[j])){
          System.out.print(arr2[j]+ " ");
       }
    }
        
    }
}