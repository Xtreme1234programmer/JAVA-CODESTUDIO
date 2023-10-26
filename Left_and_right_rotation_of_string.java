import java.util.* ;
import java.io.*; 
public class Solution {
    public static String leftRotate(String str, int d) {
        // Write you code here.
      // Store the size of given string.
        int n = str.length();

        // If rotate multiple times.
        if(n < d) {
            return leftRotate(str, d % n);
        }

        // Take an empty string.
        String ans = "";

        // Append last 'n' - 'd' characters to 'ans'.
        ans = ans + str.substring(d);

        // Append the remaining first d characters to the 'ans'.
        ans = ans + str.substring(0, d);

        // Reach this means your 'ans' is computed.
        return ans;

    }

    public static String rightRotate(String str, int d) {
        // Store the size of given string.
        int n = str.length();

        // If rotate multiple times.
        if(n < d) {
            return rightRotate(str, d % n);
        }

        // Take an empty string.
        String ans = "";

        // Append last 'd' characters to 'ans'.
        ans = ans + str.substring(n - d);

        // Append the remaining first 'n' - 'd' characters to the 'ans'.
        ans = ans + str.substring(0, n - d);

        // Reach this means your 'ans' is computed.
        return ans;
}
}
