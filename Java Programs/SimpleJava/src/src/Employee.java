/*A company wants to develop an Employee Management System to track employee details such as name, department, salary, and employee ID.
The system should also calculate the total salary expenditure and keep a record of the total number of employees.
Implement a Java program by creating an Employee class that includes instance variables for employee ID, name, department, and salary.
The class should have a default constructor that initializes employee details with default values and
a parameterized constructor that sets employee details based on user input.
Use a static variable totalEmployees to track the total number of employees and implement a static method to display this count.
Additionally, define a method calculateSalary() that returns the salary of the employee and
another method displayEmployeeInfo() to display all employee details. To ensure data encapsulation,
mark the salary variable as private and provide a public method to access it.
Declare the totalEmployees variable as static so that it is shared among all instances.
In the main method, create multiple Employee objects using both default and parameterized constructors.
Use the this keyword in the constructors to distinguish between class variables and constructor parameters.
Finally, display the total number of employees and the salary details for each employee.
The program should successfully demonstrate the behavior of static and non-static members,
the initialization of objects using constructors, and the role of access modifiers in an employee management scenario.
*/
public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    static int totalEmployees = 0;
    public Employee(){
        this.employeeID = 0;
        this.name = "Not Assigned";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++;
    }
    public Employee(int employeeID, String name, String department, double salary){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }
    public double calculateSalary(){
        return salary;
    }
    public void displayEmployeeInfo(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployees);
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.displayEmployeeInfo();
        Employee e2 = new Employee(1, "Arnav", "CSE", 100000.0);
        e2.displayEmployeeInfo();
        Employee e3 = new Employee(2, "Aman", "ECE", 200000.0);
        e3.displayEmployeeInfo();
        displayTotalEmployees();
    }
}