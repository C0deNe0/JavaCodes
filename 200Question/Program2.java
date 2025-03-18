
//Write a program to compute 1/n!.

import java.util.Scanner;

public class Program2 {
    
    public static float factorial(float x){
        if( x ==1){
            return 1;
        }
        return x*factorial(x-1);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        float num = scanner.nextFloat();
        System.out.println("The result :"+(1/factorial(num)));

        scanner.close();
    }
}