import java.util.HashMap;

public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Used to store number of subarrays starting from index zero having particular value of sum.
        HashMap < Integer, Integer > prevSum = new HashMap<Integer , Integer>();
        int n = arr.length;
        int res = 0;

        // To keep track of sum of elements so far.
        int currsum = 0;

        for (int i = 0; i < n; i++) {

            // Add current element to sum so far.
            currsum += arr[i];

            // If current sum is equal to desired sum, then a new subarray is found. So, increase count of subarrays.
            if (currsum == s) {
                res += 1;
            }
            
            /*
                If current sum exceeds given sum by current sum  - sum. 
                Find number of subarrays having this sum in our map and exclude these subarrays.
            */
            if (prevSum.containsKey(currsum - s)) {

                res += prevSum.get(currsum - s);
            }

            // Add current sum value to count of different values of sum.
            if(prevSum.containsKey(currsum)) {
                prevSum.put(currsum, prevSum.get(currsum) + 1);
            } else {
                prevSum.put(currsum, 1);
            }
        }

        return res;
    } 
}
