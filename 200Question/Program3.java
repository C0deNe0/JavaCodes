
//3. Write a program to compute x^n/n!.

import java.util.Scanner;

public class Program3 {

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
        System.out.println("Enter value of x : ");
        float x = scanner.nextFloat();
        System.out.println("The result :"+((x*num)/factorial(num)));

        scanner.close();
    }
}
