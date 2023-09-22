//   Time complexity: O(M)
//     Space complexity: O(1)
import java.util.* ;
import java.io.*; 
public class Solution {

	public static String isSubsequence(String s, String t) {    
    	// Write your code here.	
		 if(s.length()==0)
        {
            return "True";
        }
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;j++;
            }
            else
            {
                j++;
            }
        }
        if(i==s.length())
        {
            return "True";
        }
        return "False";

	}

}
