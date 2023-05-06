import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {
	
	// Write your printDivisor function here
	public static void printDivisor(int n)
	{
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
				al.add(i);
				if((n/i)!=i)
				{
					al.add(n/i);
				}
			}
		}
		Collections.sort(al);
		for(int i:al)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String args[]) {
		Solution obj = new Solution();
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		printDivisor(n);
	}
}
