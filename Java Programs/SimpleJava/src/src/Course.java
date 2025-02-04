/* A student is developing a course registration system that allows students to enroll in courses.
Each course has a course name and a course code.
Implement a Course class with appropriate attributes and use the “this” keyword
to differentiate between class attributes and constructor parameters during initialization.
Create an object of the Course class and display the course details.
*/

public class Course {
    String courseName;
    String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        Course course = new Course("Java", "CSEG1101");
        course.displayCourseDetails();
    }
}
