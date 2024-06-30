/*
1. Write a program to Print Fibonacci Series 
output:0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987.....................
*/
import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the limit for Fibonacci : ");
            int range = scanner.nextInt();
            scanner.close();
            
            System.out.println("Fibonacci Series up to " + range + " is:");
            int num1 = 0, num2 = 1;
            while (num1 < range) {
                System.out.print(num1 + " ");
                int temp = num1 + num2;
                num1=num2;
                num2 = temp;
            }
        }
    }
    