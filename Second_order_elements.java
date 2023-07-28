public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
       
        int secondLargest=secondLargest(n,a);
        int secondSmallest=secondSmallest(n, a);
         int[] ans={secondLargest,secondSmallest};
         return ans;
    }
    public static int secondLargest(int n,int[]a)
    {
        int largest=a[0];
        int slargest=-1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>largest)
            {
                slargest=largest;
                largest=a[i];
                
            }
            else if(a[i]<largest&& a[i]>slargest)
            {
                slargest=a[i];
            }
        }
        return slargest;
    } 
    public  static int secondSmallest(int n,int[]a)
    {
        int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(a[i]<smallest)
            {
                ssmallest=smallest;
                smallest=a[i];
                
            }
            else if( a[i]!=smallest&&a[i]<ssmallest)
            {
                ssmallest=a[i];
            }
        }
        return ssmallest;
    } 
}
