
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        
        int k=output.length-1;
        int rem=0;
        int sum=0;
        while(i>=0 && j>=0)
        {
            sum=arr1[i]+arr2[j]+carry;
            if(sum>9)
            {
                
                carry=sum/10;
                sum=sum%10;
                
            }
            output[k]=sum;
            i--;j--;k--;
        }
        while(i>=0)
        {
            output[k]=arr1[i]+carry;
            carry=0;
            i--;
            k--;
        }
        while(j>=0)
        {
            output[k]=arr2[j]+carry;
            carry=0;
            j--;
            k--;
        }
        if(carry!=0)
        {
            output[k]=carry;
        }
    }

}