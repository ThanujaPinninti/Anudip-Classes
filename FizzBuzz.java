public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            // Check if the number is a multiple of both 4 and 5
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is a multiple of 4
            else if (i % 4 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If the number is not a multiple of 4 or 5, print the number itself
            else {
                System.out.println(i);
            }
        }
    }
}
