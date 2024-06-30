/*1. Write a Program to find the duplicate elements in the array and print the count.*/

public class DuplicateElement {
    public static void main(String[] args) {
       
    	// Initialize the array with duplicate elements
    	int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8, 9, 10, 10}; 
    	
    	// Array to store counts of duplicates
    	int[] count = new int[arr.length]; 

    	  // Loop for each element in the array
        for (int i = 0; i < arr.length; i++) {
            
        	// Compare the current element with others
        	for (int j = i + 1; j < arr.length; j++) {
               
    			// Check if elements are the same
        		if (arr[i] == arr[j]) { 
                
        			// Increment count if duplicate found
        			count[i]++; 
                }
            }
        }
        
        // Loop to count array to print duplicates
        for (int i = 0; i < arr.length; i++) {
        	
    		// If the element has duplicates
        	if (count[i] > 0) { 
        		
        		// Print element and count
        		System.out.println(arr[i] + " is there " + (count[i] + 1) + " times."); 
                
        		// Reset count to avoid reprinting
        		count[i] = 0; 
           
        	}
        }
    }
}
/*output */
/* PS E:\Programming\anudip> javac DuplicateElement.java
PS E:\Programming\anudip> java DuplicateElement      
2 is there 2 times.
3 is there 2 times.
8 is there 2 times.
10 is there 2 times.
PS E:\Programming\anudip>*/

