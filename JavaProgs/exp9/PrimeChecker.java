package exp9;

import java.util.ArrayList;

public class PrimeChecker {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing is storing int primitives into ArrayList<Integer>
        for (int i = 1; i <= 20; i++) {
            numbers.add(i); // autoboxing is happening here
        }

        for (Integer num : numbers) {
            int value = num; // unboxing
            if (isPrime(value)) {
                System.out.println(value + " is a prime number.");
            } else {
                System.out.println(value + " is not a prime number.");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
