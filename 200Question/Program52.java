
//Write a program to find the nth strong number.

import java.util.Scanner;

public class Program52 {
    
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
        if(sum == temp) return 1;
       else return 0;
     }
        
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int i=0;
        while (num>0) {
            int res = checkStrongNo(i);
            if(res ==1) num--;
            i++;
        }
        System.out.println(i-1);
        scanner.close();
    } 

}
