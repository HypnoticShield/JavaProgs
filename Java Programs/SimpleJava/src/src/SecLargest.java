/*Write a Java program to find the second largest element in an integer array without sorting the array, if not exist return -1.
Example:
Input: arr = {12,32,22,54,39,53,19}
Output: 53
*/
import java.util.Scanner;
public class SecLargest {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }
        else{
            System.out.println("Second largest element is: "+second);
        }
    }
}
