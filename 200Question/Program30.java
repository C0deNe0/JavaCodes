
//Write a program to find out all palindrome numbers present within a given range.

import java.util.Scanner;

public class Program30 {
    
    
    public static int reverse(int n){
        int rem=0,rev=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            rev= rev*10+rem;            
        }
        return rev;
    }
     
    public static void palindrome(int n){
        int rev = reverse(n);
        if(n ==rev){
            System.out.print(n+",");
        }
        else{
            System.out.print("");
        }
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for(int i=0;i<num;i++){
            palindrome(i);
        }

        scanner.close();
    } 
}
