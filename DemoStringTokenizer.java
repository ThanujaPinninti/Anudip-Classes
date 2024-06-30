import java.util.StringTokenizer;

public class DemoStringTokenizer {
    public static void main(String[] args) {
        // Create a StringTokenizer instance to split the string "Hello Java World"
        // using a space (" ") as the delimiter, and not returning the delimiters as tokens.
        StringTokenizer strt = new StringTokenizer("Hello Java World", " ", false);
        
        // Print the number of tokens present in the StringTokenizer instance.
        System.out.println(strt.countTokens());
        
        // Iterate through the tokens and print each one.
        while (strt.hasMoreTokens()) {
            System.out.println(strt.nextToken());
        }
        
        // Convert the StringTokenizer object to a string using its toString() method.
        String str = strt.toString(); 
        // Print the result of the toString() method (note: this will not print the tokens).
        System.out.println(str);
    }
}

