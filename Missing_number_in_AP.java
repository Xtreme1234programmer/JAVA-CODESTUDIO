import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
          int d=(arr[n-1]-arr[0])/n;
        int res=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]-arr[i]!=d) res=arr[i]+d;
        }
        return res;
    }
}

