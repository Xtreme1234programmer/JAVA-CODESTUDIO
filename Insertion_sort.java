/*
	Time complexity: O(N^2)
	Space complexity: O(1)
	
	Where 'N' is the size of the array.
*/

import java.util.* ;
import java.io.*; 

public class Solution {

	public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		for(int i=1;i<n;i++)
		{
			int j=i;
			while(j>0&&arr[j]<arr[j-1])
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
}
