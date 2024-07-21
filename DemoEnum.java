// Define an enum named Department with various department types
enum Department {
    Accounts,  // Represents the Accounts department
    Devops,    // Represents the DevOps department
    Testing,   // Represents the Testing department
    HR         // Represents the HR department
}

// Define a class named DemoEnum to demonstrate the usage of the Department enum
public class DemoEnum {
    public static void main(String[] args) {
        // Create an instance of the Department enum and assign it the value Testing
        Department d = Department.Testing;
        
        // Create another instance of the Department enum and assign it the value Accounts
        Department d1 = Department.Accounts;
        
        // Print the value of the enum instance d
        System.out.println(d); // Output: Testing
        
        // Compare the ordinal value of d with d1 and print the result
        // compareTo method returns a negative integer, zero, or a positive integer 
        // as this object is less than, equal to, or greater than the specified object.
        System.out.println(d.compareTo(d1)); // Output: 2 (Testing is at position 2, Accounts is at position 0)
        
        // Check if d is equal to d1 and print the result
        System.out.println(d.equals(d1)); // Output: false (Testing is not equal to Accounts)
    }
}
