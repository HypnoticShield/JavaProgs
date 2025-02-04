/*Create a University class that has a static variable universityName and a non-static variable studentName.
Include a static method to display the university name.
Then, create multiple student objects to demonstrate how the static variable is shared among all instances,
while the non-static variable holds unique values for each object.
*/

public class University {
    static String universityName = "University of Petroleum and Energy Studies";
    String studentName;

    public static void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    public static void main(String[] args) {
        displayUniversity();
        University s1 = new University();
        s1.studentName = "Arnav";
        displayUniversity();
        University s2 = new University();
        s2.studentName = "Saisha";
        s2.universityName = "UPES";

        displayUniversity();
        System.out.println("Student 1: " + s1.studentName);
        System.out.println("Student 2: " + s2.studentName);
    }
}
