
//Write a program to check whether a given number is prime or not.

import java.util.Scanner;

public class Program12 {


    public static int primeNo(int n){
        int i;
        for(i=2;i*i<=n;i++){
            if(n%i==0) return 1;
        }
        return 0;
    }
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        if(primeNo(num)==1) System.out.println("Not a Prime");
        else System.out.println("It is a prime number");

        scanner.close();
    }
}
