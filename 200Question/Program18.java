import java.util.Scanner;

//Write a program to check whether a given number is an Abundant number or not.
//An abundant number is a positive integer for which the sum of its proper divisors (excluding the number itself) is greater than the number. For example, the proper divisors of 12 are 1, 2, 3, 4, and 6, and their sum is 16, which is greater than 12.

public class Program18 {
    

    public static int checkAbundantNo(int n){
        int sum= 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }

        }
        return sum;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();


        if(checkAbundantNo(num) >num) System.out.println("This is a Abundant number");
        else System.out.println("This is Not a Abundant Number");

        scanner.close();
    } //   PRIME No check kar
}
