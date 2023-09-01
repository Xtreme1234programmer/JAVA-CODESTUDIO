public class Solution {
    public static String commonPrefix(String []arr,int n){
        //Write your code here
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            while(arr[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "-1";
            }
        }
        return prefix;
        
    }
}
