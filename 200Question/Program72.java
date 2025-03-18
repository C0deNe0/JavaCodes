
//Write a program to calculate 
/*
 * Amicable numbers and friendly numbers are related concepts but not exactly the same. Amicable numbers are pairs of numbers where each number is the sum of the proper divisors of the other number. For example, the numbers 220 and 284 are amicable because the sum of the proper divisors of 220 equals 284, and the sum of the proper divisors of 284 equals 220
 */

import java.util.Scanner;

public class Program72 {

    public static int sumOfTheProperDivisors(int n){
        int sum =0;
        for(int i=1;i<=n;i++){

            if(n%i==0) sum+=i;
        }
        // System.out.println(sum);j
        return sum;
    }
    
    public static void amicableNo(int a,int b){
        if(sumOfTheProperDivisors(a)==sumOfTheProperDivisors(b)){
            System.out.println(a+" and "+b +" are amicable number.");
        }
        else{
            System.out.println("not  a amicable number");
        }
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        amicableNo(num1,num2);
        scanner.close();
    } 
    
}
