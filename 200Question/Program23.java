
//Write a Program to check whether the number is Spy Number or Not.

import java.util.Scanner;

public class Program23 {
    
    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        return sum;
    }


    public static int productOfAllDigits(int n){
        int mul =1,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            mul*=rem;
        }
        return mul;
    }

    public static void spyNo(int x){
        if(sumOfallDigits(x)==productOfAllDigits(x)){
            System.out.println("It is a spy number ");
        }else{
            System.out.println("It is not a spy number");
        }

    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        spyNo(num);

        scanner.close();
    } //   PRIME No check kar
}
