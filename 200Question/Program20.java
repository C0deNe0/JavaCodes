
//Write a Program to check whether the number is Magic Number or Not.

import java.util.Scanner;

public class Program20 {
    public static int sumOfallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem;
        }
        return sum;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        
        while (num>9) {
            num=sumOfallDigits(num);
        }

        System.out.println("The Result"+num);

        scanner.close();
    } 
}
