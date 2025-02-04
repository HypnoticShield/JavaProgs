/*Create a Student class with attributes for name and age.
Implement a default constructor to assign default values and a parameterized constructor to initialize the attributes with user
defined values.
Create objects using both constructors and display their details
*/
import java.util.Scanner;

public class Stu1 {
    int age;
    String name;
    Stu1(){
        age=20;
        name="John";
    }
    Stu1(int a,String n){
        age=a;
        name=n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stu1 s1=new Stu1();
        System.out.println("Default values are:");
        System.out.println("Name:"+s1.name);
        System.out.println("Age:"+s1.age);
        System.out.println("Enter name and age:");
        String n=sc.next();
        int a=sc.nextInt();
        Stu1 s2=new Stu1(a,n);
        System.out.println("User defined values are:");
        System.out.println("Name:"+s2.name);
        System.out.println("Age:"+s2.age);
    }
}
