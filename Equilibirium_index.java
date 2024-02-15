import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n=arr.length;
		int sum=0;
		int rightSum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];

		}

		for(int i=0;i<n;i++)
		{
			sum-=arr[i];
			if(sum==rightSum){return i;}
			rightSum+=arr[i];

		}

		return -1;

		
	}
}
