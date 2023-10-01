import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
		// Write your code here.
		ArrayList<Integer> ans=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int ele:arr1)
		{
			map.put(ele,map.getOrDefault(ele, 0)+1);
		}
		int count=0;
		for(int ele:arr2)
		{
			if(map.containsKey(ele))
			{
				count++;
			}
		}
		ans.add(count);
		int union=n+m-count;
		ans.add(union);
		return ans;
	}
}
