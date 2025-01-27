/* Given an array  of size n, return the majority element.

The majority element is the element that appears more than
⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example:
Input: nums = [2,2,1,1,1,2,2]
Output: 2 */

import java.util.*;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int majority = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                majority = arr[i];
                count = 1;
            } else if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(majority);
        sc.close();
    }
}
