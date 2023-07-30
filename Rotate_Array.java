import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);
    }

    static void rotateArray(int arr[], int n, int k) {
        // storing 1st k elements in temporary array
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // shifting remaining elements of the array
    
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
    
        //storing back the k elements to the orignal array
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
        //printing array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
