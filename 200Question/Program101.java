
// Wap a program to swap to numbers without using temp variable

import java.util.Scanner;

public class Program101 {
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        
        num1 = num1^num2;
        num2 = num2^num1;  
        num1 = num1^num2;
        //  a^=b^=a=b;
        System.out.println(num1 +" "+ num2);
        // System.out.println(a +" "+ b);
        
        scanner.close();
    } 
}
