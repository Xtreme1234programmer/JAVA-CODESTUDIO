/*
Time Complexity: O(Log(N))

Space Complexity: O(1)

Where 'N' is the number of elements in the array 'Arr'.
*/
public class Solution {
    public static int getSingleElement(int []arr){
        int n = arr.length;

        int lo = 0, hi = n - 2;

        // Performing binary-search for the position of the single element.
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(check(mid, arr))
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return arr[lo];
    }
    // Monotonic(Boolean) function, that returns 1, for positions of elements before the single element, and 0 otherwise.
    public static boolean check(int pos, int []arr){
        return (arr[pos] == arr[pos + 1]) == ((pos % 2) == 0);
    };
}
