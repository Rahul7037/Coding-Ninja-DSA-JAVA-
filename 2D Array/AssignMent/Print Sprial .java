
// public class Solution {

// 	public static void spiralPrint(int matrix[][]){
// 		//Your code goes here
// 	}
// }

public class Solution 
{
	public static void spiralPrint(int matrix[][])
    {
		//Your code goes here
        if(matrix.length == 0){ 
         System.out.print("");
            return;
        }
        int minr = 0;
        int minc =0;
        int maxr = matrix.length -1;
        int maxc = matrix[0].length -1;
        
        int tne = matrix.length * matrix[0].length;
        int cnt = 0;
        while(cnt < tne){ 
        
        //top row
            
            for(int i = minr, j = minc; j <= maxc && cnt < tne; j++){ 
               
                System.out.print(matrix[i][j]+ " ");
                 cnt++;
            }
            minr++;
            
        //right col
            for(int i = minr, j = maxc; i<= maxr && cnt < tne; i++){ 
               
                System.out.print(matrix[i][j]+ " ");
                cnt++;
            }
            maxc--;
        
      // bottom row
            
            for(int i = maxr, j = maxc; j >= minc && cnt < tne; j--){ 
               
                System.out.print(matrix[i][j]+ " ");
                cnt++;
            }
            maxr--;
            
        // left col  
         
            for(int i = maxr, j = minc; i >= minr && cnt < tne; i--){ 
               
                System.out.print(matrix[i][j]+ " ");
                cnt++;
            }
            minc++;
        
        }
	}
}