
//Write a program to find out all Harshad numbers present within a given range.

import java.util.Scanner;

public class Program36 {
    
    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        return sum;
    }

    public static int checkHarshadNo(int n){
        int sum = sumOfallDigits(n);
        if(n%sum==0){
            return 1;
        }else{
            return 0;
        }
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if(checkHarshadNo(i)==1) System.out.print(i+" ");
            else System.out.print(" ");
        }

        scanner.close();
    } //   PRIME No check kar
}
