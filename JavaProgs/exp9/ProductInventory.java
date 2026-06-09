package exp9;
import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        
        inventory.put(1001, 50);
        inventory.put(1002, 30);
        inventory.put(1003, 20);

        // Update quantity of one product (e.g., product ID 1002)
        inventory.put(1002, 45);

        // Remove one product by ID (e.g., product ID 1003)
        inventory.remove(1003);
        
        System.out.println("Final Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}