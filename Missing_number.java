public class Solution {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        int sum=(N*(N+1))/2;
         int currSum=0;
         for(int i=0;i<a.length;i++)
         {
             currSum+=a[i];
         }
         return sum-currSum;
    }
}
