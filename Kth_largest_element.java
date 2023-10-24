import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int findKthLargest(ArrayList<Integer> arr, int k) {

		// Write your code here.
		  PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr.get(i));
        }
        for(int i=k;i<arr.size();i++)
        {
            if(pq.peek()<arr.get(i))
            {
                pq.remove();
                pq.add(arr.get(i));
            }
        }
        return pq.peek();
        
	}
}
