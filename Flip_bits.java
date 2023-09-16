import java.util.* ;
import java.io.*; 
public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
		int one_counts=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
			else
			{
			
				arr[i]=-1;
					one_counts++;
			}
		}

		return one_counts+kadane(arr);
	}
	public static int  kadane(int[] arr)
	{
		int curr_sum=arr[0];
		int max_sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			curr_sum=Math.max(arr[i],curr_sum+arr[i]);
			max_sum=Math.max(curr_sum,max_sum);
		}
		return Math.max(0,max_sum);
	}
}
