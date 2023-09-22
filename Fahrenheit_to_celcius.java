import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int gap=sc.nextInt();
		for(int i=start;i<=end;i+=gap)
		{
			int res=(int)(5*(i-32))/9;
			if(res>0){
			System.out.println(i+" "+(int)(Math.floor(res)));
			}
			else
			{
				System.out.println(i+" "+(int)(Math.ceil(res)));
			}
		}
		


		
		
	}
}
