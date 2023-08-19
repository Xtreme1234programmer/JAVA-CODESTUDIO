import java.util.*;
public class Solution {
    public static int[] spiralMatrix(int [][]matrix) {
        // Write your code here.
       
         int n=matrix.length;
        int m=matrix[0].length;
         int mat[]=new int[n*m];

        int top=0;
        int k=0;
        int left=0;
        int bottom=n-1;
        int right=m-1;
        while(top<=bottom&&left<=right&&k<=n*m)
        {
            //left
            for(int i=left;i<=right;i++)
            {
                mat[k++]=matrix[top][i];
            }
            top++;
            

            //top-bottom
            for(int i=top;i<=bottom;i++)
            {
                mat[k++]=matrix[i][right];
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    mat[k++]=matrix[bottom][i];

                bottom--;
                
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = bottom; i >= top; i--){
                    mat[k++]=matrix[i][left];
                }
                left++;
                
            }


        }
        return mat;
    }
}
