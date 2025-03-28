
//Write a program to check whether a given number is a Harshad number or not.

import java.util.Scanner;

public class Program17 {

    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        return sum;
    }

    public static void checkHarshadNo(int n){
        int sum = sumOfallDigits(n);
        if(n%sum==0){
            System.out.println("It is a Harshad number ");
        }else{
            System.out.println("It is Not a Harshad number");
        }
    }
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        checkHarshadNo(num);


        scanner.close();
    } //   PRIME No check kar
    
}
