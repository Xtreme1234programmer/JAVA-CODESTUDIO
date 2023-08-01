import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int first=firstIndex(arr, x,n);
		System.out.println(first);

		

	}
	private static int firstIndex(int[] arr,int x,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				return i;

			}
			
		}
		return -1;
		
	}
}
