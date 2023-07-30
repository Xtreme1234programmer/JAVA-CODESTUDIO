import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
         ArrayList<Integer> ans=new ArrayList<>();
         func(0,0,num,ans);
         Collections.sort(ans);
         return ans;

    }
    private static void func(int ind,int sum,int num[],ArrayList<Integer> ans)
    {
        if(ind==num.length)
        {
            ans.add(sum);
            return;
        }

        func(ind+1,sum+num[ind],num,ans);//pick
        func(ind+1,sum,num,ans);//not pick

    }

}
