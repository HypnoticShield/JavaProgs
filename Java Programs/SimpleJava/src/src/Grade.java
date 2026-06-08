//Write a program to calculate the final grade of a student based on the marks entered in three subjects. Use the following grading scale:
//Average >= 90: Grade A
//Average >= 75: Grade B
//Average >= 50: Grade C
//Otherwise: Grade F

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of three subjects: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int avg = (sub1 + sub2 + sub3) / 3;
        if (avg >= 90) {
            System.out.println("Grade A");
        } else if (avg >= 75) {
            System.out.println("Grade B");
        } else if (avg >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}