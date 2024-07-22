/*1. Write a program to find the maximum and minimum values from an array.*/
package com.abc;
public class MaxMin {
    public static void main(String[] args) {
    //array for elements
    int[] arr = {7, 45, 18, 77, 38};
    //initialize min and max
    int min = arr[0];
    int max = arr[0];
    //array for assuming the values
    for (int i = 1; i < arr.length; i++) {
        //condition for min
        if (arr[i] < min) {
            min = arr[i];
        }
        //condition for max
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    //printing the values here
    System.out.println("Minimum value: " + min);
    System.out.println("Maximum value: " + max);
    }
}

    /*output */
    /*
PS E:\Programming\anudip> javac MaxMin.java
PS E:\Programming\anudip> java MaxMin      
Minimum value: 7
Maximum value: 77
PS E:\Programming\anudip>  */
    
    