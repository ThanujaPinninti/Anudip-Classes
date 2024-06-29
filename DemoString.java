/*1. Write a program to define a String object and demonstrate  multiple methods of String.*/
public class DemoString {
    public static void main(String[] args) {

        // String declaration using literal
        String name = "Anudip";
        System.out.println(name); // Output: Anudip

        // Defining String using constructor
        String course = new String("Full stack");
        System.out.println(course); // Output: Full stack

        // Defining a character array
        char[] courseType = {'a', 'b', 'c'};

        // Defining String using character array
        String course1 = new String(courseType);
        System.out.println(course1); // Output: abc

        // Concatenate strings
        System.out.println(name.concat(" Foundation")); // Output: Anudip Foundation

        // Reassigning the value of name
        name = "Anudip Foundation";
        System.out.println(name); // Output: Anudip Foundation

        // Get the character at index 15
        System.out.println(name.charAt(15)); // Output: i

        // Get the last index of character 'n'
        System.out.println(name.lastIndexOf('n')); // Output: 16

        // Get the index of character 'n' starting from index 2
        System.out.println(name.indexOf('n', 2)); // Output: 4

        // Get the length of the string
        System.out.println(name.length()); // Output: 17

        // Defining another string
        String name1 = "Anudip Foundation";

        // Check if name contains the string course
        System.out.println(name.contains(course)); // Output: false

        // Get the index of character 'c'
        System.out.println(name.indexOf('c')); // Output: 13

        // Compare name and course1 lexicographically
        System.out.println(name.compareTo(course1)); // Output: positive number since "Anudip Foundation" > "abc"

        // Check if name is equal to course1
        System.out.println(name.equals(course1)); // Output: false

        // Compare name and name1 lexicographically
        System.out.println(name.compareTo(name1)); // Output: 0 (since both are equal)

        // Compare name and name1 ignoring case differences
        System.out.println(name.compareToIgnoreCase(name1)); // Output: 0 (since both are equal ignoring case)

        // String case conversion
        String name2 = "thanu";
        String name3 = "MCA";
        System.out.println(name2.toUpperCase()); // Output: THANU
        System.out.println(name3.toLowerCase()); // Output: mca
    }
}
