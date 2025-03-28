
//Write a program to find the smallest digit in a number.

import java.util.Scanner;

public class Program71 {
    public static void smallestDigit(int n){
        int smallest=n;
        int rem =0;
        while (n>0) {
            rem = n%10;
            n/=10;
            if(rem < smallest) smallest =rem;
            
        }
        System.out.println("The smallest digit is :"+smallest);
    }

    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        smallestDigit(num);

        scanner.close();
    } 
}
