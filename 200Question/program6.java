
//Write a program to reverse a given number.

import java.util.Scanner;

public class program6 {

    public static int reverse(int n){
        int rem=0,rev=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            rev= rev*10+rem;            
        }
        return rev;
    }
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println("The reverse of number : "+ reverse(num));
        scanner.close();
    }
}
