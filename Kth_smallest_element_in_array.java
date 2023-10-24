import java.util.ArrayList;
import java.util.*;


public class Solution {
	public static int kthSmallestElement(ArrayList<Integer> arr, int n, int k) {
		// Write Your Code here
		 PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            pq.add(arr.get(i));
        }
        for(int i=k;i<arr.size();i++)
        {
            if(pq.peek()>arr.get(i))
            {
                pq.remove();
                pq.add(arr.get(i));
            }
        }
        return pq.peek();
	}
}
