package strings;

public class StringLengthDivisible {

    static int isDivisible(String s) {
        int k = s.length();  // Get the length of the string

        // Check if length is divisible by 7
        if (k % 7 == 0) {
            return 1; // Return 1 if divisible
        } else {
            return 0; // Return 0 otherwise
        }
    }

    public static void main(String[] args) {
        String s = "abcdfgrt";  // Example string

        System.out.println("Is divisible by 7: " + isDivisible(s)); // Pass 's' as an argument
    }
}
