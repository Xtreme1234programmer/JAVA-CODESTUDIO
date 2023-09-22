import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=countSetBits(n);
		System.out.println(result);
	}

		public static int countSetBits(int n){
		String s=Integer.toBinaryString(n);
		char ch[]=s.toCharArray();
		int count=0;
		for(char c:ch)
		{
			
			if(c=='1')
			{
				count++;
			}
		}
		return count;
		
	}
}
