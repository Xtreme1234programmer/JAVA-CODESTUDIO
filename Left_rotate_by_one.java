import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int[] temp=new int[n];
        for(int i=0;i<n-1;i++)
        {
            temp[i]=arr[i+1];
        }
        temp[n-1]=arr[0];

return temp;
    }
    
}
