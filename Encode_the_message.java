import java.util.* ;
import java.io.*; 
public class Solution {
	public static String encode(String str) {
		// Write your code here.
	  //Your code here
          int n=str.length();
          StringBuilder sb=new StringBuilder();
          for(int i=0;i<n;i++)
          {
              char currChar=str.charAt(i);
              int currFreq=1;
              while(i+1<n && str.charAt(i+1)==currChar)
              {
                  i++;
                  currFreq++;
              }
               sb.append(currChar);
          sb.append(""+currFreq);
          }
         
          return sb.toString();
	}
}
