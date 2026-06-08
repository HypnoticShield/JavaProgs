/*Write a Java program to rotate an array right by K positions.
Example:
Input: arr = [1, 2, 3, 4, 5], K = 2
Output: [4, 5, 1, 2, 3]
*/
import java.util.*;
public class Rotate {
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = arr[i];
        }
        return rotatedArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();
        sc.close();
        int[] rotatedArr = rotateArray(arr, k);
        System.out.println(Arrays.toString(rotatedArr));
    }
}
