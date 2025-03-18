
//Write a program to generate and show the first 15 narcissistic decimal numbers.

import java.util.Scanner;

public class Program81 {
     public static int countTheDigits(int x){
        int count=0;
        while (x!=0) {
            x/=10;
            count++;            
        }
        // System.out.println("The count is :"+count);
        return count;
    }

    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }   
        // System.out.println("the power"+p);
        return p;
    }

    public static int checkArmstrong(int n){
        int count = countTheDigits(n);
        int temp =n;
        int rem=0,sum=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            sum = sum +power(rem, count);
        }
        // System.out.println("the sum "+sum);
        // return sum;
        if(sum == temp ) return 1;
        else return 0;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int count = 0;
        int i=0;
        while (count!=15) {
            if(checkArmstrong(i)==1){
                System.out.print(i+" ");
                count++;
            } 
                
            else System.out.print("");
            i++;
        }
        scanner.close();
        }
    }

