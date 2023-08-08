import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        String array[] = input.split(" ");

        String reverse="";

        for(int i=array.length-1;i>=0;i--){

            reverse = reverse+array[i]+" ";

        }

        return reverse;

 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
