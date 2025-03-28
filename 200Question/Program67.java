
//Write a program to find the Generic root of a number.

import java.util.Scanner;

public class Program67 {
    
    public static int sumOfAllDigits(int n){
        int rem=0,sum=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            sum+=rem;
        }
        return sum;
    }


    public static int genericRoot(int num){
       int x= sumOfAllDigits(num);
       if(x<=9) return 1;
        else{
             return genericRoot(x);
        }
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if(genericRoot(num)==1){
            System.out.println("generic root");
        }else{
            System.out.println("not a generic number");
        }
        scanner.close();
    } 

}


/*
 * if(num%9==0) return 1;
 * else return 0;
 */