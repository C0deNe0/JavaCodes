
//Write a program to find the number of odd and even digits in the given number.

import java.util.Scanner;

public class Program75 {
    


    public static void oddAndEvenDigits(int n){
        int rem =0;
        int counta=0;
        int countb=0;
        while (n>0) {
            rem=n%10;
            if(rem%2==0) counta++;
            else countb++;
            n/=10;
        }
        System.out.println("The number of Even digits are: "+counta);
        System.out.println("The number of oDD digits are: "+countb);

    }


public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        oddAndEvenDigits(num);

        scanner.close();
    } 
}
