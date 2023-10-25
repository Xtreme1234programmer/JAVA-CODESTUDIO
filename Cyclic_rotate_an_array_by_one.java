import java.util.* ;
import java.io.*; 
public class Solution {
	public static void rotate(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int last=arr.get(n-1);
		for(int i=n-2;i>=0;i--)
		{
			arr.set(i+1,arr.get(i));
		}
		arr.set(0,last);
	}
}
