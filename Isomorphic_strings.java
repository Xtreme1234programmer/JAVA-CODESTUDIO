import java.util.*;

public class Solution {
    public static boolean areIsomorphic(String str1, String str2) {
        // Write your code here.
         if(str1.length()!=str2.length())
            {
                return false;
            }
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Boolean> map2=new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
           
            if(map1.containsKey(ch1)==true)
            {
                if(map1.get(ch1)!=ch2)
                {
                    return false;
                }
            }
            else{
                if(map2.containsKey(ch2)==true)
                {
                        return false;
                    
                }
                else{
                    map1.put(ch1,ch2);
                    map2.put(ch2,true);

                }
            }

        }
        return true;

    }
}
