/*Given a string s, reverse the words of the string.

Example 1:
Input: s=”This is decent”
Output: “decent is This”
*/
import java.util.*;
public class Reverse{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}
