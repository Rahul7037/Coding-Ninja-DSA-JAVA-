1st Method

public class Solution{	
public static int duplicateNumber(int[] arr){
    int k=0;
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        int temp=arr[i];
        if(count==0)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (temp==arr[j]){
                count=1;
                k=arr[i];
                break;}
                
            }
            
        }
      
    }
      return k;
	}
}


2nd Method 



import java.util.*;
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        HashSet<Integer> a = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            if(a.contains(temp)){
                return temp;
            }
            a.add(temp);
        }
        return 1;
    }
}