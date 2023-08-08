import java.util.*;
public class Solution {
    public static List< Integer > nextGreaterPermutation(List< Integer > nums) {
        // Write your code here.
         int i=nums.size()-2;
        while(i>=0&&nums.get(i)>=nums.get(i+1))
        {
            i--;
        }
        if(i>=0)
        {
            int j=nums.size()-1;
            while(nums.get(i)>=nums.get(j))
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.size()-1);
        return nums;
    }
    public  static void swap(List< Integer > nums,int i,int j)
    {
        int temp=nums.get(i);
        nums.set(i,nums.get(j));
        nums.set(j,temp);
    }
    public static void reverse(List< Integer > nums,int i,int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    }
