import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []arr) {
        // Write your code here.
         // Last element of an array is always a leader, push into ans array.
     ArrayList<Integer> ans= new ArrayList<>();
   int n=arr.length;
   int max = arr[n - 1];

    ans.add(arr[n-1]);
    
    // Start checking from the end whether a number is greater than max no. from right, hence leader.
    for (int i = n - 1; i >= 0; i--)
      if (arr[i] > max) {
        ans.add(arr[i]);
        max = arr[i];
      }

  return ans;
    }
}
