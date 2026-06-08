# Java Programs Repository

A comprehensive collection of Java programs, structured into two main projects:
1. **Simple Java Programs (`JavaProgs/`)**: A collection of isolated standalone Java exercises covering core programming logic, array manipulation, and basic algorithms.
2. **VS Code Java Project (`Java Programs/SimpleJava/`)**: A structured Java project containing more advanced concepts like object-oriented programming (OOP), packages, inheritance, encapsulation, method overloading, polymorphism, and access modifiers.

---

## 📂 Repository Structure

- `JavaProgs/`: Standalone `.java` programs and experiments.
- `Java Programs/SimpleJava/`: A VS Code formatted Java project.
  - `src/src/`: Contains source files and packages.
    - `p/`: Subpackage illustrating access modifiers.
    - `src/Balance/`: Subpackage demonstrating cross-package imports.

---

## 📖 Program Descriptions & Explanations

### 1. Standalone Programs (`JavaProgs/`)

| File Name | Description / Explanation | Key Concepts |
| :--- | :--- | :--- |
| `BankAccount.java` | Implements a simple bank account class with encapsulated fields, deposit, withdraw, and checkBalance operations. | Encapsulation, Classes |
| `Grade.java` | Takes a student's marks and determines their corresponding grade (A, B, C, D, etc.) using conditional logic. | Control Flow, Conditionals |
| `Majority.java` | Finds the majority element (appears more than `n/2` times) in an array using the Boyer-Moore Voting Algorithm. | Arrays, Algorithms |
| `MaxMin.java` | Finds and prints the minimum and maximum values inside an integer array. | Arrays, Loops |
| `Move.java` | Moves all occurrences of zero in an array to the end while preserving the relative order of non-zero elements. | Array Manipulation, Two-pointer |
| `Palindrome.java` | Verifies whether a given array/sequence reads the same forwards and backwards. | Strings/Arrays, Palindromes |
| `Pattern.java` | Prints a descending numeric pattern pyramid (from 5 down to 1). | Nested Loops |
| `Reverse.java` | Reverses the elements of an integer array in place. | Array Manipulation |
| `Rmduplicate.java` | Removes duplicate values from an array to ensure all elements are unique. | Arrays, Filtering |
| `Rotate.java` | Rotates elements of an array to the right by a user-specified number of steps. | Arrays, Rotation |
| `SecLargest.java` | Iterates through an array to identify the second largest value without sorting. | Arrays, Search |
| `ShapeArea.java` | Demonstrates method overloading by using a single method name `Area` to compute areas of Rectangles, Squares, Circles, and Triangles. | Method Overloading, Geometry |
| `Stu1.java` | Implements a simple `Student` class showcasing the usage of both default and parameterized constructors. | Constructors, OOP |
| `dayofweek.java` | Inputs a digit (1-7) and displays the corresponding day of the week using a switch statement. | Switch-Case Statements |

---

### 2. VS Code Project Programs (`Java Programs/SimpleJava/src/src/`)

| File Name | Description / Explanation | Key Concepts |
| :--- | :--- | :--- |
| `BA.java` | Driver class that instantiates and tests the `BankAccount` class. | Entry Point, Testing |
| `BankAccount.java` | Fully implemented class managing a bank account with deposit, withdraw, and balance checking capabilities. | Encapsulation |
| `Course.java` | Course registration class showcasing the use of the `this` keyword to differentiate instance variables from parameters. | Constructor, `this` keyword |
| `Employee.java` | Tracks employee profiles (ID, name, department, salary) using instance variables, a private salary variable with getters, and a static `totalEmployees` counter. | Encapsulation, Static Members |
| `Player.java` | Establishes a base `Player` class and derives subclasses (`Cricket_Player`, `Football_Player`, `Hockey_Player`) to model specific athletes. | Hierarchical Inheritance |
| `PrivateMemberDemo.java` | Demonstrates that a subclass (`Privchild`) cannot directly access a private variable in its superclass (`Privsuper`), forcing access through public getters. | Access Modifiers, Privacy |
| `University.java` | Contrasts static fields (shared across all instances like `universityName`) with non-static fields (unique per student instance like `studentName`). | Static vs Instance Variables |
| `Vehicle.java` | Implements multilevel inheritance (`Vehicle` -> `Car` -> `ElectricCar`) and subclassing (`Motorcycle`), showing constructor chaining (`super()`) and polymorphism. | Multilevel Inheritance, Constructor Chaining, Polymorphism |
| `Worker.java` | Models a payment system with `DailyWorker` (hourly) and `SalariedWorker` (fixed rate) subclasses using polymorphism. | Polymorphism, Inheritance |
| `p/A.java` | Declares fields/methods with different access levels (`public`, `protected`, `private`, and package-private/default) to serve as an access check target. | Access Control |
| `p/B.java` | Extends class `A` in the same package and attempts accessing the defined public, protected, and private members. | Inheritance, Access Modifiers |
| `Balance/Account.java` | Encapsulates bank balance query functionality under a customized package namespace `src.src.Balance`. | Custom Packages |
| `Balance/Main.java` | Imports and uses the custom `Account` package, demonstrating how to reference classes defined in distinct namespaces. | Package Imports |

*(Note: Duplicate programs like `Grade`, `Majority`, `MaxMin`, etc. are also included in this project workspace for standalone compilation within VS Code)*
