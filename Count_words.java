import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static int  countWords(String str) {
        // Check if the string is null
        // or empty then return zero
        if (str    == null || str.isEmpty())
            return 0;
         
        // Create a StringTokenizer with the
        // given string passed as a parameter
        StringTokenizer tokens = new
          StringTokenizer(str);
         
        // Return the number of words
        // in the given string using
        // countTokens() method
        return tokens.countTokens();
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}
