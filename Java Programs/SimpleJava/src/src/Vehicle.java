/*A vehicle manufacturing company produces different types of vehicles, such as cars and motorcycles.
The base class Vehicle contains common properties like brand, model, and price.
The class Car extends Vehicle by adding attributes like seatingCapacity and fuelType.
Further, a subclass ElectricCar extends Car, introducing additional attributes like batteryCapacity and chargingTime.
The Motorcycle class extends Vehicle and adds engineCapacity and type (e.g., "Sport", "Cruiser").
Implement this vehicle hierarchy system using multilevel inheritance in Java.
Use constructor chaining to initialize attributes efficiently and demonstrate polymorphism by
overriding a method displayDetails() in each subclass.
 */
package src;

class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;

    public Car(String brand, String model, double price) {
        super(brand, model, price);
        this.seatingCapacity = 5;
        this.fuelType = "Petrol";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class ElectricCar extends Car {
    int batteryCapacity;
    int chargingTime;

    public ElectricCar(String brand, String model, double price, int batteryCapacity, int chargingTime) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}
class Motorcycle extends Vehicle {
    int engineCapacity;
    String type;

    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Type: " + type);
    }
}

public class Vehicle {
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla", 1500000);
        c.displayDetails();

        ElectricCar ec = new ElectricCar("Tesla", "Model S", 10000000, 100, 2);
        ec.displayDetails();

        Motorcycle m = new Motorcycle("Harley-Davidson", "Iron 883", 1000000, 883, "Cruiser");
        m.displayDetails();
    }
}