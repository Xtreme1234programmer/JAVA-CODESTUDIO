import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static void printSubstrings(String str) {
        // Write your code here
          // First loop for starting index
    for (int i = 0; i < str.length(); i++) {
        String subStr="";
       
        // Second loop is generating sub-String
        for (int j = i; j < str.length(); j++) {
            subStr += str.charAt(j);
            System.out.print(subStr +"\n");
        }
    }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
