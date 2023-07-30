import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int i=0;
		for(int j=1;j<arr.size();j++)
		{
			if(!arr.get(i).equals(arr.get(j)))
			{
				arr.set(i+1,arr.get(j));
				i++;
			}
		}
		return i+1;
	}
}
