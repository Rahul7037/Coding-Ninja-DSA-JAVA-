
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        // int rows = mat.length;
        // int cols = mat[0].length;
         int sumROw =0;
        for(int i=0;i<mat.length;i++){
           
            for(int j=0;j<mat[i].length;j++){
                sumROw += mat[i][j];
            }
        }
        System.out.print(sumROw + " ");
        sumROw = 0;
        
        
        
        
	}
}