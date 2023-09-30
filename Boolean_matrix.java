import java.util.* ;
import java.io.*; 
public class Solution {
	public static void modifyMatrix(int matrix[][], int n, int m) {
		// Write your code here
		
        int[] row =new int[n];
        int[] col=new int[m];

        //traverse the matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==1)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        //where there are 1s make the corresponding rows and columns as 1s.
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1||col[j]==1)
                {
                    matrix[i][j]=1;
                }
            }
        }
	}
}
