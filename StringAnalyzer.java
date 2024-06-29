import java.util.Scanner;

public class StringAnalyzer {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Initialize counters for vowels, consonants, and words
        int vowelCount = 0;
        int consonantCount = 0;
        int wordCount = 0;

        // Split the input string into words using whitespace as a delimiter
        String[] words = inputString.split("\\s+");
        wordCount = words.length;  // The number of words is the length of the array
        
        // Iterate over each character in the input string
        for (char ch : inputString.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {  
                // Convert the character to lowercase and check if it is a vowel
                switch (Character.toLowerCase(ch)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelCount += 1;  // Increment vowel count
                        break;
                    default:
                        consonantCount += 1;  // Increment consonant count
                        break;
                }
            }
        }
        
        // Print the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of words: " + wordCount);
        
        scanner.close();
    }
}
