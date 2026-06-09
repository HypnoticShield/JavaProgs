package exp7;

abstract class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    void calculateSalary() {
        // Salary already fixed for manager
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + fixedSalary);
    }
}

class Developer extends Employee {
    double hourlyWage;
    int hoursWorked;
    double totalSalary;

    Developer(String name, double hourlyWage, int hoursWorked) {
        super(name, "Developer");
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        totalSalary = hourlyWage * hoursWorked;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + totalSalary);
    }
}

public class Notmain {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 80000);
        Employee developer = new Developer("Bob", 50, 160);

        manager.calculateSalary();
        developer.calculateSalary();

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
    }
}