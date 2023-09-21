 /*
    Time complexity: O(N)
    Space Complexity: O(1)

    Where N is the number of elements in the array.
*/

public class Solution {
    public static int[] separateNegativeAndPositive(int []nums) {

        // 'j' stores the index of the leftmost positive element.
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {

                // Current element is negative.
                if (i != j) {

                    // Swap the current element with the leftmost positive element.
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

                ++j;
            }
        }

        return nums;
    }
} 
