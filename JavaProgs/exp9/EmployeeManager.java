package exp9;

import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 101, 60000));
        employees.add(new Employee("Bob", 102, 55000));
        employees.add(new Employee("Charlie", 103, 50000));

        for (Employee e : employees) {
            if (e.id == 102) {
                e.setSalary(58000); // Update Bob's salary
            }
        }

        employees.removeIf(e -> e.id == 103); // Remove Charlie

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}