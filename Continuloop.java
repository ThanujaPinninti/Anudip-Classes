import java.util.Scanner;
public class Continuloop {
    public static void main(String[] args) {
        // Declare variables for range and sum
        int range, sum = 0;
        
        // Prompt the user to enter the range
        System.out.println("Enter range:");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt(); // Read the range from user input

        // Loop from 0 to the specified range
        for (int i = 0; i <= range; i++) {
            // Check if the current number is even
            if (i % 2 == 0)
                continue; // Skip the rest of the loop if the number is even
            
            // Add the current odd number to the sum
            sum += i;
            // Print the current sum
            System.out.println(sum);
        }
        
        sc.close();
    }
}
