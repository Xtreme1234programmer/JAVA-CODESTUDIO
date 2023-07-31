public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
         int left=0;
        for(int right=0;right<a.length;right++)
        {
            if(a[right]!=0)
            {
                a[left]=a[right];
                left++;
            }
        }
        for(int i=left;i<a.length;i++)
        {
            a[i]=0;
        }
        return a; 
        
    }
}
