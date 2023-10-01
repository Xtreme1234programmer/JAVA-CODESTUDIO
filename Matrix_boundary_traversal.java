import java.util.* ;
import java.io.*; 

public class Solution {

    static int[] matrixBoundaryTraversal(int[][] mat, int m, int n) {
        // Write your code here.
        // Declare an array to store the boundary elements.
        int[] ans = new int[2*n+2*m-4];
        int itr=0;

        // Fill the first row.
        for (int i = 0; i < n; i++) {
            ans[itr++] = mat[0][i];
        }

        // Fill the last row.
        for (int i = 0; i < n; i++) {
            ans[itr++] = mat[m - 1][i];
        }

        // Fill the first column.
        // Do not insert first and last element.
        for (int i = 1; i < m - 1; i++) {
            ans[itr++] = mat[i][0];
        }

        // Fill the last column.
        // Do not insert first and last element.
        for (int i = 1; i < m - 1; i++) {
            ans[itr++] = mat[i][n - 1];
        }

        // Return ans.
        return ans;
    }
}
