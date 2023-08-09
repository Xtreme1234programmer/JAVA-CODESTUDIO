*/
import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {

        int answer = 0;

        int n = a.length;

        // Initialize an empty HashSet 'hash'.
        HashSet< Integer > hash = new HashSet<>();

        // Insert elements of array in the HashSet.
        for (int i = 0; i < n; i++) {
            hash.add(a[i]);
        }

        // For all elements in 'a'.
        for (int i = 0; i < n; i++) {

            // If 'A[ i ]' - 1 is not present in 'hash':
            if (!hash.contains(a[i] - 1)) {

                int curEle = a[i];

                // While 'curEle'+1 is present in 'hash':
                while (hash.contains(curEle + 1)) {
                    curEle++;
                }

                // Update the answer with the maximum length.
                int curLen = curEle - a[i] + 1;
                answer = Math.max(answer, curLen);
            }
        }

        // Return the 'answer' here.
        return answer;
    }
}
