
public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        int sum=0;
        int N=mat.length;
        for(int i = 0;i<N;i++){
            for(int j=0;j<N;j++){
                
                // Condition for diagonal
                // elements
                if (i == j || (i + j) == N - 1) {
                    sum += mat[i][j];
                }
     
                // Condition for Boundary
                // elements
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.print(sum);
	}

}