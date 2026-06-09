package exp8;
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures version compatibility
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to serialize the object
    public void serializeToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this);
            System.out.println("Serialization successful! Data saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    // Static method to deserialize the object
    public static Person deserializeFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
            return null;
        }
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Main method
    public static void main(String[] args) {
        String fileName = "person.txt";

        // Create a Person object
        Person person = new Person("Alice", 30);

        // Serialize the object
        person.serializeToFile(fileName);

        // Deserialize the object
        Person deserializedPerson = Person.deserializeFromFile(fileName);

        // Confirm deserialization
        if (deserializedPerson != null) {
            System.out.println("Deserialized Object: " + deserializedPerson);
        }
    }
}
