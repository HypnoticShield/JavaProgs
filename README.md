# Java Programs Repository

A comprehensive collection of Java programs, structured into three main sections:
1. **Simple Java Programs (`JavaProgs/`)**: A collection of isolated standalone Java exercises covering core programming logic, array manipulation, and basic algorithms.
2. **VS Code Java Project (`Java Programs/SimpleJava/`)**: A structured Java project containing more advanced concepts like object-oriented programming (OOP), packages, inheritance, encapsulation, method overloading, polymorphism, and access modifiers.
3. **Experiment Lab Programs (`JavaProgs/expX/`)**: Practical laboratory exercises targeting structured concepts like multi-threading, custom exception handling, file streams, and collections.

---

## 📂 Repository Structure

- `JavaProgs/`: Standalone `.java` programs, GUI applications, and experiments.
  - `exp7/`: Exception handling, inheritance, and polymorphism experiments.
  - `exp8/`: File reader, counter, and stream experiments.
  - `exp9/`: Collections, Sets, ArrayLists, and multithreading experiments.
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
| `dayofweek.java` | Inputs a digit (1-7) and displays the corresponding day of the week using a switch statement. | Switch-Case Statements |
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
| `SimpleCalculator.java` | An interactive GUI calculator enabling standard arithmetic (Add, Subtract, Multiply, Divide). | Swing UI, Math Operations |
| `StopwatchApp.java` | A multithreaded GUI stopwatch enabling Start, Stop, and Reset control using background timers. | Swing GUI, Timer, Multithreading |
| `Stu1.java` | Implements a simple `Student` class showcasing the usage of both default and parameterized constructors. | Constructors, OOP |

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

---

### 3. Experiment Lab Programs (`JavaProgs/exp7/`, `JavaProgs/exp8/`, `JavaProgs/exp9/`)

| File / Package Path | Description / Explanation | Key Concepts |
| :--- | :--- | :--- |
| **Experiment 7** | **Object-Oriented Programming, Polymorphism & Exception Handling** | |
| `exp7/BankDemo.java` | Models client withdrawal transactions and utilizes a custom exception (`InsufficientFundsException`) to handle negative balance results. | Custom Exceptions, Try-Catch |
| `exp7/Main.java` | Demonstrates basic polymorphism by deriving concrete classes `Rectangle` and `Circle` from an abstract base `Shape`. | Abstract Classes, Polymorphism |
| `exp7/Notmain.java` | Explains dynamic method dispatch and inheritance hierarchies using custom paint properties on abstract geometric shapes. | Dynamic Method Dispatch, OOP |
| `exp7/TestPlayer.java` | Models athletes by defining single/hierarchical inheritance using class levels `Player`, `CricketPlayer`, etc. | Constructors, Inheritance |
| **Experiment 8** | **File Operations & Input/Output Streams** | |
| `exp8/FileWordCharCounter.java` | Counts lines, word units, and non-whitespace characters inside a given text file using file readers. | File I/O, Characters & Strings |
| `exp8/readfile.java` | Scans and prints the contents of external files with robust error handling for missing target files. | Scanner, FileNotFoundException |
| `exp8/Person.java` / `Student.java` / `Reader.java` | Demonstrates writing student data records into `student.txt` and reading them back using standard file writer streams. | FileWriter, Reader Streams, Files |
| **Experiment 9** | **Advanced Collections & Multi-threaded Execution** | |
| `exp9/EmployeeManager.java` | Performs dynamic employee list actions using generic lists to query/update staff records. | ArrayList, Collection |
| `exp9/PrimeChecker.java` | Tests number values for primality concurrently by utilizing multi-threaded threads in Java. | Multithreading, Concurrency |
| `exp9/ProductInventory.java` | Manages stock lists and inventory items. | OOP, Arrays/Lists |
| `exp9/UniqueNames.java` | Stores names in a Set collection to automatically filter duplicates. | Set, Collection |
| `exp9/UniqueSum.java` | Summarizes unique entries inside collections. | Collections, Logic |

*(Note: Duplicate programs like `Grade`, `Majority`, `MaxMin`, etc. are also included in this project workspace for standalone compilation within VS Code)*
