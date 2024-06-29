public class DemoStringBuffer {
    public static void main(String[] args) {
        
        // Create a StringBuffer with the initial content "Anudip"
        StringBuffer strbuff = new StringBuffer("Anudip");
        System.out.println(strbuff); // Output: Anudip

        // Append "Foundation" to the current StringBuffer
        strbuff.append("Foundation");
        System.out.println(strbuff); // Output: AnudipFoundation

        // Reverse the content of the StringBuffer
        System.out.println(strbuff.reverse()); // Output: noitadnuoFpidunA

        // Print the character at index 7
        System.out.println(strbuff.charAt(7)); // Output: o

        // Get the index of the first occurrence of 'p'
        System.out.println(strbuff.indexOf("p")); // Output: 11

        // Get the current capacity of the StringBuffer
        System.out.println(strbuff.capacity()); // Output: 34 (default capacity is 16 + length of "AnudipFoundation")

        // Create a new StringBuffer with a different content
        StringBuffer strb = new StringBuffer("Advance program on java fullstack using Angular");
        System.out.println(strb.capacity()); // Output: 58 (default capacity is 16 + length of "Advance program on java fullstack using Angular")

        // Delete the character at index 8
        strb.deleteCharAt(8);
        System.out.println(strb); // Output: Advance rogram on java fullstack using Angular

        // Get the Unicode code point at index 0
        System.out.println(strb.codePointAt(0)); // Output: 65 (Unicode code point of 'A')

        // Compare the two StringBuffers lexicographically
        System.out.println(strb.compareTo(strbuff)); // Output: positive number (strb > strbuff)

        // Convert strbuff to a StringBuilder
        StringBuilder strb2 = new StringBuilder(strbuff);
        System.out.println(strb2); // Output: noitadnuoFpidunA (content of the reversed strbuff)
    }
}
