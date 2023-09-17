import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		//write your code here
		HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(!map.containsKey(ch))
            {
                map.put(ch,right);
            }
            else
            {
                left=Math.max(left,map.get(ch)+1);
                map.put(ch,right);
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
	}
}
