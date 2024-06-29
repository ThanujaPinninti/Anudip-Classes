import java.util.Scanner;

// Airplane.java
// Class that implements the Airways interface
public class Airplane implements Airways {

    private String name;

    // Constructor to initialize the airplane name
    public Airplane(String name) {
        this.name = name;
    }

    // Overriding the fly method to provide specific implementation for Airplane
    @Override
    public void fly(String destination) {
        System.out.println("Flying the " + name + " airplane to " + destination);
    }

    // Overriding the getType method to return the type of the vehicle
    @Override
    public String getType() {
        return "Airplane";
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking airplane name input from the user
        System.out.print("Enter the name of the airplane (e.g., India, London, American, Australia, UK, US): ");
        String name = scanner.nextLine();

        // Creating an instance of Airplane with the provided name
        Airplane airplane = new Airplane(name);

        // Taking destination input from the user
        System.out.print("Enter the destination: ");
        String destination = scanner.nextLine();

        // Calling the fly method with user input
        airplane.fly(destination);

        scanner.close();
    }
}
