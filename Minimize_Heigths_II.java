class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
    
         int result = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
         Arrays.sort(arr);
         
        result  = arr[n-1] - arr[0];
        for(int i=0;i<n-1;i++){ 
            
            max = Math.max(arr[i] + k, arr[n-1] - k);
            
            min = Math.min(arr[0] + k, arr[i+1] - k);
            if (min < 0) continue;
            result = Math.min(result,max - min);
        } 
        return result;
    }
}
