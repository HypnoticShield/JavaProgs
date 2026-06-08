/*Given an integer array nums of size n, find the maximum and minimum elements in the array and return them as a pair.
Example:
Input: nums = [1, 5, 7, 2, 9, 3]
Output: [9, 1]
 */
import java.util.*;

public class MaxMin {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println("[" + max + ", " + min + "]");
        sc.close();
    }
}
