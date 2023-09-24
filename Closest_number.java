import java.util.* ;
import java.io.*; 
public class Solution {
    public static int closestNumber(int n, int m) {
        // Write your code here.
         int num1 = (n / m) * m;
        int num2 = num1;

        if(n < 0)
        {
            num1 -= m;
        }
        else
        {
            num2 += m;
        }

        int diff1 = Math.abs(n - num1);
        int diff2 = Math.abs(n - num2);

        if(diff1 <= diff2)
        {
            return num1;
        }
        
        return num2;
    
        
       
    }
}
