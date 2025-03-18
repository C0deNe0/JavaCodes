
//Write a program to find out all Strong numbers present within a given range.

import java.util.Scanner;

public class Program34 {

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
        int temp =n;
        while (n!=0) {
            rem = n%10;
            n/=10;
            sum = sum + factorial(rem);
        }
        // System.out.println("the sum "+sum);
       if(sum == temp) return 1;
       else return 0;
    }
        
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();


        for(int i =0;i<num;i++){
            if(checkStrongNo(i)==1 ) System.out.print(i+" ");
            else System.out.print("");
        }

        scanner.close();
    } //   PRIME No check kar
}
