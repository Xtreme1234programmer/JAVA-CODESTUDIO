import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> repeatedSubstring(int n, String s)  {
        // Write your code here.
         Set<String> set=new HashSet<>();
        Set<String> list=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String substring=s.substring(i,i+10);
            if(set.contains(substring))
            {
                list.add(substring);
            }
            else
            {
                set.add(substring);
            }
        }
        return new ArrayList(list);

    }
}
