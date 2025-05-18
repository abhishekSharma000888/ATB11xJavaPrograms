package ex_14_generics;

public class Lab01_Addition {

    public static void main(String[] args) {
        // Test with integers and doubles
        System.out.println("Sum (int): " + add(1, 16));
        System.out.println("Sum (double): " + add(4.345, 0.678));
    }

    /**
     * Adds two numbers of type T (extends Number).
     * Works for Integer, Double, Float, etc.
     */
    static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue(); // Convert to double for arithmetic
    }
}