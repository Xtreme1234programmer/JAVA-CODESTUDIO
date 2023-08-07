import java.util.*;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        int n = a.length;

        // Initialize two empty arrays, 'pos' and 'neg'.
        List< Integer > pos = new ArrayList<>();
        List< Integer > neg = new ArrayList<>();

        // Push positive elements to 'pos' array and
        // push negative elements to 'neg' array.
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                pos.add(a[i]);
            }
            else {
                neg.add(a[i]);
            }
        }

        int i = 0, j = 0, k = 0;

        // Update the array 'a' with alternate postive and
        // negative numbers.
        while (i < pos.size() && j < neg.size()) {
            a[k] = pos.get(i);
            k++;
            i++;
            a[k] = neg.get(j);
            k++;
            j++;
        }

        // Return the answer 'a' here.
        return a;
    }
}
