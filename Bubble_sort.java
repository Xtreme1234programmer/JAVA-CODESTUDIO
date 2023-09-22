
/*
    Time Complexity : O(n ^ 2)
    Space Complexity : O(1)
    where n is size of the input array
*/
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<n-1;i++)
        {
            
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
    }

}
