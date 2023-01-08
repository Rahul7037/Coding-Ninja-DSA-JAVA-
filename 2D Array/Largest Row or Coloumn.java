
public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        int i,j;
        // int c=0;
        // int ans = 'r';
        int largest1 = Integer.MIN_VALUE;
        //int clargest = Integer.MAX_VALUE;
        int temp1 =0;
         int rows = mat.length;        
          if(rows==0){
            System.out.println("row 0 "+Integer.MIN_VALUE);
            return;
        }
        
        
        int cols = mat[0].length;
        
        
// ROW sUM  ++++++++++++++++++++++++++++++++++++++++
        for(i = 0; i < mat.length;  i++){
            int rSum=0;
            for(j = 0 ; j < mat[0].length; j++){
                rSum = rSum + mat[i][j];
            }
            if (rSum > largest1){
                largest1 = rSum;
                temp1=i;;
            }
            //System.out.print("row" + i + largest);
        }
        
// Column Sum
        int largest2=Integer.MIN_VALUE;
        int temp2=0;
        for(j = 0; j<mat[0].length;j++){
            int cSum = 0;
            for(i=0;i<mat.length;i++){
                cSum = cSum + mat[i][j];
            }
            if(cSum>largest2){
                largest2 = cSum;
                temp2=j;
            } 
        }
        
        if(largest1>=largest2){
            System.out.print("row "+temp1+" "+ largest1);
        }
        else
        {
            System.out.print("column " +temp2+ " " + largest2);
        }
	}
}