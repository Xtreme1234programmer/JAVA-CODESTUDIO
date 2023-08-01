import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int n=arr.size();
        swap(arr, m+1, n-1);
        

    }

    private static void swap(ArrayList<Integer> arr,int i,int j)
    {
        while(i<j)
        {
            int element = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, element);
            i++;
            j--;
        }
    }
}
