import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int nums1[], int nums2[], int m, int n) {
        // Write your code here.
     
        int i=m-1,j=n-1,k=n+m-1;

        while(i>=0&&j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        while(i>=0){nums1[k--]=nums1[i--];}
        while(j>=0){nums1[k--]=nums2[j--];}
        return nums1;
    }
}
