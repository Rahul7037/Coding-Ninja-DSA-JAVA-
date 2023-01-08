
public class Solution {

    public static void sort012(int[] arr){
    	//Your code goes here
        int i=0;
        int cz=0;  //Counts Zeros
        int co=0;  //Counts Ones
        int ct=0;  //Counts Twos
        
        while(i<arr.length){
            if(arr[i] == 0){
                cz+=1;
            }
            else if(arr[i] == 1){
                co+=1;
            }
            else{
                ct+=2;
            }
            i+=1;
        }
        for(i=0;i<cz;i++){
            arr[i] = 0;
        }
        for(i=cz;i<cz+co;i++){
            arr[i] = 1;
        }
        for(i=cz+co;i<arr.length;i++){
            arr[i] = 2;
        }
    }

}