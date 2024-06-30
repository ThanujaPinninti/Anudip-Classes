public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuffer strb = new StringBuffer("Hello world");
        
        // content of the StringBuffer
        System.out.println(strb); 
        
        // length of the StringBuffer
        System.out.println(strb.length()); 
        
        // Index of the first occurrence of the substring "o"
        System.out.println(strb.indexOf("o")); 
        
        // Convert the StringBuffer to a String 
        String s = strb.toString();
        System.out.println(s); 
        
        StringBuffer strb1 = new StringBuffer(strb);
        
        // Print the content of the new StringBuffer
        System.out.println(strb1); 
    }
}
