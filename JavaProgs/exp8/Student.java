package exp8;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();
        String studentData = "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n";

        try (FileWriter writer = new FileWriter("student.txt", true)) { // 'true' enables append mode
            writer.write(studentData);
            System.out.println("Student record saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file. " + e.getMessage());
        } finally {
            System.out.println("File operation attempted.");
        }

        sc.close();
    }
}
