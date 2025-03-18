
//Write a program to sum all digits of a number.

import java.util.Scanner;

    

public class Program5 {
    
    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();


        System.out.println(sumOfallDigits(num));
        scanner.close();
        
    }
}
