import java.util.ArrayList;
public class Solution {  public static int findPeakElement(ArrayList<Integer> arr) {
        // Array size
        int n = arr.size();

        // Single element
        if (n == 1) {
            return 0;
        }
        // Strictly descreasing
        if (arr.get(0) >= arr.get(1)) {
            return 0;
        }
        // Strictly increasing
        if (arr.get(n - 1) >= arr.get(n - 2)) {
            return n - 1;
        }
        // Binary search
        int l = 1, r = n - 2;
        int ans = l;
        while (l <= r) {
            int middle = (l + r) / 2;

            if (arr.get(middle) < arr.get(middle - 1)) {
                // Search the left half
                r = middle - 1;
            } else if (arr.get(middle) < arr.get(middle + 1)) {
                // Search the right half
                l = middle + 1;
            } else {
                // Ans found
                ans = middle;
                break;
            }
        }
        return ans;
    }

};
