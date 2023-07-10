import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int esum=0;
		int osum=0;

		while(temp>0)
		{
			int digit=temp%10;
			temp/=10;
			if(digit%2==0) esum+=digit;
		else osum+=digit;
		}
		

		System.out.println(esum +" "+osum);

	}
}
