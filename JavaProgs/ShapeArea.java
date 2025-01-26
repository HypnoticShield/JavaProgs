//Write a program to find the area of a shape (Rectangle, Square, Circle, Triangle) using method overloading.

import java.util.Scanner;

public class ShapeArea {

    double Area(double length, double breadth) {
        return length * breadth;
    }

    double Area(double side) {
        return side * side;
    }

    double Area(float radius) {
        return Math.PI * radius * radius;
    }

    double Area(float base, float height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        ShapeArea areaCalculator = new ShapeArea();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shape (Rectangle, Square, Circle, Triangle): ");
        String shape = sc.next();
        switch (shape) {
            case "Rectangle":
                System.out.print("Enter the length and breadth of the rectangle: ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                System.out.println("Area of the rectangle: " + areaCalculator.Area(length, breadth));
                break;
            case "Square":
                System.out.print("Enter the side of the square: ");
                double side = sc.nextDouble();
                System.out.println("Area of the square: " + areaCalculator.Area(side));
                break;
            case "Circle":
                System.out.print("Enter the radius of the circle: ");
                float radius = sc.nextFloat();
                System.out.println("Area of the circle: " + areaCalculator.Area(radius));
                break;
            case "Triangle":
                System.out.print("Enter the base and height of the triangle: ");
                float base = sc.nextFloat();
                float height = sc.nextFloat();
                System.out.println("Area of the triangle: " + areaCalculator.Area(base, height, true));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}