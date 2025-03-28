
//Write a program to find the factorial of a number.

import java.util.Scanner;

public class Program9 {
    
    public static float factorial(float x){
        if( x ==1){
            return 1;
        }
        return x*factorial(x-1);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println("The factorial : "+factorial(num));
        scanner.close();
    }

}
