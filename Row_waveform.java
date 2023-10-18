import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<mat.size();i++)
		{
			if(i%2!=0)
			{
				for(int j=mat.get(0).size()-1;j>=0;j--)
				{
					al.add(mat.get(i).get(j));
				}
			}
			else
			{
				for(int j=0;j<mat.get(0).size();j++)
				{
					al.add(mat.get(i).get(j));
				}
			}
		}
		return al;
	}
}
