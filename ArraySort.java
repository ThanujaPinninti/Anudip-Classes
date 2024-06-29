/*2. Write a program to sort the array elements. */
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // Array of unsorted elements
        int[] numbers = {5, 2, 9, 1, 7, 4};
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Print the sorted array in ascending order
        System.out.println("Ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Reverse the sorted array to get descending order
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - i - 1];
            numbers[n - i - 1] = temp;
        }
        
        // Print the sorted array in descending order
        System.out.println("Descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
/*Output */
/*PS E:\Programming\anudip> javac ArraySort.java
PS E:\Programming\anudip> java ArraySort      
Ascending order:
1 2 4 5 7 9
Descending order:
9 7 5 4 2 1 */
