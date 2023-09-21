import java.util.* ;
import java.io.*; 
public class Solution
{
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
        int sum[]=new int[n];
        int max_sum=Integer.MIN_VALUE;
        for(int cStart=0;cStart<m;cStart++)
        {
            Arrays.fill(sum,0);
            for(int cEnd=cStart;cEnd<m;cEnd++)
            {
                for(int row=0;row<n;row++)
                {
                    sum[row]+=arr[row][cEnd];
                }
                int curr_Max_sum=kadane(sum);
                 max_sum=Math.max(curr_Max_sum,max_sum);
            }
        }
        return max_sum;
    }

    public static int kadane(int[] arr)
    {
        int max_sum_sofar=arr[0];
        int curr_sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            curr_sum=Math.max(arr[i],curr_sum+arr[i]);
            max_sum_sofar=Math.max(curr_sum,max_sum_sofar);
        }
        return max_sum_sofar;

    }
}
