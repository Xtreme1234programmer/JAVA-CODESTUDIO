public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
           double area = 0.0;

        // Using switch-case to figure out whose area we want to find

        switch (ch) {

            case 1: // Circle
                area = Math.PI * a[0] * a[0];
                break;

            case 2: // Rectangle
                area = a[0] * a[1];

        }

        // Returning the calculated area
        return area;
    }
}
