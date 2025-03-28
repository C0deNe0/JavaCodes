
//Write a program to find the 2nd smallest digit in a given number.

import java.util.Scanner;

public class Program74 {
      public static void secondSmallestDigit(int n){
        int smallest=n;
        int rem =0;
        int temp =n;
        while (n>0) {
            rem = n%10;
            n/=10;
            if(rem < smallest) smallest =rem;
            
        }
        System.out.println("The smallest digit is :"+smallest);
        int rev =0;
        while (temp!=0) {
            rem = temp%10;
            temp/=10;
            if(rem == smallest) rem =9;
            rev = rev*10+rem;
        }
        System.out.println(rev);
        smallest =rev;
        while(rev>0){
            rem = rev%10;
            rev/=10;
            if(rem < smallest) smallest =rem;
        }
        System.out.println("The second smallest digit is :"+smallest);
    }


    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        secondSmallestDigit(num);

        scanner.close();
    } 
    
}
