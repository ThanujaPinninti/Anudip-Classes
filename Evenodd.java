import java.util.Scanner;

public class Evenodd {
    static void checkNum(int n){
        if(n%2==0)
        System.out.println(n +"is an even number");
        else
        System.out.println(n +"is an odd number");
    }

    public static void main(String [] args){ 
        int num;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        checkNum(num);
        

    }
    
}
