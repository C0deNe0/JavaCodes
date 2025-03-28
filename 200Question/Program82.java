
/*
 * Write a Java program to display first 10 lucus numbers.
The Lucas numbers or series are an integer sequence named after the mathematician
François Édouard Anatole Lucas, who studied both that sequence and the closely
related Fibonacci numbers. Lucas numbers and Fibonacci numbers form
complementary instances of Lucas sequences.
The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ....
 */

import java.util.Scanner;

public class Program82 {
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int count =0;
        int a1 =2,a2=1;
        int next = 0;
        System.out.print(a1 +" "+a2+" ");
        while (count!=8) {
            next=a1+a2;
            System.out.print(next+" ");
            a1 =a2;
            a2= next;
            count++;
        }

        scanner.close();
    } 
}
