/*Remove Duplicate Elements in Unsorted Array.
Example:
Input: arr[] = {2,1,3,5,5,3,2,7,2,8,7,5}
Output: arr[] = {1,2,3,5,7,8}
*/
import java.util.Arrays;

public class Rmduplicate {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) return arr;

        int[] temp = new int[n];
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            if (!isPresent(temp, j, arr[i])) {
                temp[j++] = arr[i];
            }
        }

        int[] uniqueArr = new int[j];
        System.arraycopy(temp, 0, uniqueArr, 0, j);
        
        return uniqueArr;
    }

    private static boolean isPresent(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 5, 3, 2, 7, 2, 8, 7, 5};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArr));
    }
}
