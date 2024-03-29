import java.util.*;
 class Solution {
    public static List< List< Integer > > nQueens(int n)
    {
       int[][] board=new int[n][n];
        for(int i=0;i<n;i++){
            
                for(int j=0;j<n;j++)
                {
                    board[i][j]=0;
                }
    }

        List<List<Integer>> ans=new ArrayList<>();
        nqueens(board,0,ans);
        return ans;
    }

    // Backtracking function to solve the N Queens problem
    public static void nqueens(int[][] board, int row,List<List<Integer>> ans) {
        // Base case: if all queens are placed, return true
        int n=board.length;
        if (row==n) {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++)//copy 2-d array into list of integers.
            {

                for(int j=0;j<n;j++)
                {
                   list.add(board[i][j]);
                }
               
            }
            ans.add(list);
            return;
            
        }
 
        // Try placing queen in each col in the current column
        for (int j = 0; j < n; j++) {
            // Check if it is safe to place queen in this row and column
            if (isSafe(board, row, j)) {
                // Place queen on this cell
                board[row][j] =  1;
 
                nqueens(board, row + 1,ans);
 
                // If placing queen here doesn't lead to a solution, backtrack
                board[row][j] = 0;
            }
        }
         
    }
 
    // Helper function to check if it is safe to place queen in this row and column
    public static boolean isSafe(int[][] board, int row, int col) {
        // Check if there is any queen in the same row
        int n=board.length;
        for (int i = 0; i <n; i++) {
            if (board[row][i] ==1) {
                return false;
            }
        }
 
        // Check if there is any queen in the same col
        for (int i = 0;i<n;i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
 
        // Check north-east
        int i=row;
        int j=col;
        while(i>=0&&j<n)
        {
            if(board[i][j]==1) return false;
            i--;
            j++;
        }

    //check north-east
        i=row;
         j=col;
        while(i<n&&j<n)
        {
            if(board[i][j]==1) return false;
            i++;
            j++;
        }
 
        //check south-west
         i=row;
         j=col;
        while(i<n&&j>=0)
        {
            if(board[i][j]==1) return false;
            i++;
            j--;
        }
        //check north-west
         i=row;
         j=col;
        while(i>=0&&j>=0)
        {
            if(board[i][j]==1) return false;
            i--;
            j--;
        }
        // If all checks pass, it is safe to place queen in this row and column
        return true;
}
}
