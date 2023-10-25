import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> sortBinaryArray(ArrayList<Integer> arr, int n) {
		//	Write your code here.
		  int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==0)
            {
                int t=arr.get(i);
                arr.set(i,arr.get(count));
                arr.set(count,t);
                count++;
            }
        }
		return arr;
	}
}
