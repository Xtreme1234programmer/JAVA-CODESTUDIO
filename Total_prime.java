// Time Complexity: O(N*sqrt(N)), Where N is the difference between the range
// Auxiliary Space: O(1)
import java.util.* ;
import java.io.*; 

// Create the classes here

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int result=totalPrime(start,end);
		System.out.println(result);

	}
	public static boolean isPrime(int n) {
        // 0 and 1 are neither prime nor composite numbers
        if (n == 0 || n == 1) {
            return false;
        }
        // 2 is a prime number
        if (n == 2) {
            return true;
        }
        // every composite number has a prime factor
        // less than or equal to its square root.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
 
    }

	public static int totalPrime(int start,int end)
	{
		int count=0;
		
		for(int i=start;i<=end;i++)
		{
			
			if(isPrime(i))
			{
				count++;
			}
		}
		return count;
			
			
	}
}
