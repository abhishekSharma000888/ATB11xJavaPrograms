package strings;


public class Palindrome {

        public static void main(String[] args) {
            String word = "abba";


            char firstChar = word.charAt(0);
            System.out.println("First character: " + firstChar);


            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }


        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

