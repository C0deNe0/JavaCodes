
//Write a program to check whether a given number is a perfect number or not.
// positive integer that is equal to the sum of its positive divisors, excluding the number itself

import java.util.Scanner;

public class Program16 {

    public static int checkPerfectNo(int n){
        int sum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if(checkPerfectNo(num) ==num) System.out.println("This is a Strong number");
        else System.out.println("This is Not a Strong Number");
        scanner.close();
    } //   PRIME No check kar
    
}
