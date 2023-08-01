public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        // Create ans, count and right, and assign with 0.
        int ans = 0, count = 0, right = 0 ;
        // For loop to move the left pointer.
        for(int left = 0; left < n; left++)
        {
            // while right is less than n and count is <= m.
            while(right < n && count <= m)
            {
                // If vehicle at right is 0.
                if(vehicle[right] == 0)
                {
                    count++ ;
                    // Break if count exceeds m.
                    if(count > m)
                    {
                        count-- ;
                        break ;
                    }
                }
                right++ ;
            }
            // Update answer.
            ans = Math.max(ans, right - left) ;
            // If vehicle at left is 0.
            if(vehicle[left] == 0)
            {
                count-- ;
            }
        }
        // Return answer.
        return ans ;
    }
}
