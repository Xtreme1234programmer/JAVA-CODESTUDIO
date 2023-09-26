import java.util.* ;
import java.io.*; 
public class Solution {
    public static Character mostFrequentChar(String s) {
        // Write your code here..
        int[] count = new int[26];
        int max = 0;
        char ch = 0;

        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(max < count[i]) {
                max = count[i];
                ch = (char) (i + 'a');
            }
        }

        return ch;
    }
}
