public class Solution {

    public static int minimumJumps(int[] arr, int N) {
        // Write your code here

        if(N<=1) return 0;
        if(arr[0]==0) return -1;

        int steps=arr[0];
        int maxReach=arr[0];
        int jumps=1;

        for(int i=1;i<N;i++)
        {
            if(i==N-1) return jumps;
            maxReach=Integer.max(maxReach, arr[i]+i);
            steps--;
            if(steps==0)
            {
                jumps++;
                if(i>=maxReach) return -1;
                steps=maxReach-i;
            }

        }
        return -1;

    }

}
