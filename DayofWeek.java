import java.util.Scanner;

public class DayofWeek {
    
    // Method to print the day of the week based on the given number
    static void printDay(int d) {
        switch(d) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }

    public static void main(String[] args) {
        // Declare a variable to hold the day number
        int dayNo;

        // Prompt the user to enter the day number
        System.out.println("Enter Day number:");
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the day number input from the user
        dayNo = scanner.nextInt();
        
        // Call the printDay method to print the corresponding day of the week
        printDay(dayNo);

        
        // Close the scanner
        scanner.close();
    }
}
