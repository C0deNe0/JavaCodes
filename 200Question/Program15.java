
//Write a program to check whether a given number is a strong number or not. 
// IN this the sum of factorial of all digits indivisually is a strong number => 145 = 1! + 4! + 5! = 145

import java.util.Scanner;

public class Program15 {

    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }
        return p;
    }


    public static int factorial(int x){
        if(x==0){
            return 1;

        }

        return x*factorial(x-1);
    }



    public static int checkStrongNo(int n){
        int rem=0,sum=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            sum = sum + factorial(rem);
        }
        // System.out.println("the sum "+sum);
        return sum;
        
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        // System.out.println("Result :"+checkArmstrong(num));
        if(checkStrongNo(num) ==num) System.out.println("This is a Strong number");
        else System.out.println("This is Not a Strong Number");
        scanner.close();
    }
    
}
