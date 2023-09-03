public class Solution {

    public static boolean isAnagram(String str1, String str2) {
        //Your code goes here
        if(str1.length()!=str2.length()) return false;
        int char_counts[]=new int[26];
        for(int i=0;i<str1.length();i++)
        {
            char_counts[str1.charAt(i)-'a']++;
            char_counts[str2.charAt(i)-'a']--;

        }
        for(int count:char_counts)
        {
            if(count!=0) return false;
        }
        return true;
    }

}
