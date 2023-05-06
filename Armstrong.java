public class Solution 
{
	public static boolean isArmstrong(int n)
	{
	    
        // code here
		int count=0;
        int arm=0;
        int temp=n;
        while(temp>0){
        int dig=temp%10;
        arm+=Math.pow(dig,count(n));
        temp/=10;
        }
        
        if(arm==n){ return true;}
        else{
        return false;
    }}

	public static int count(int n)
	{
		int count=0;
		 int temp=n;
        while(temp>0){
        int dig=temp%10;
		count++;
        temp/=10;
        }
		return count;
	}

}
