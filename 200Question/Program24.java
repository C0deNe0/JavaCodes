
//Write a Program to check whether the number is Happy Number or Not.

/*A happy number is a number that eventually reaches 1 when replaced by the sum of the squares of its digits repeatedly. If the process leads to a cycle that does not include 1, the number is not happy and is referred to as sad or unhappy.

For example, the number 19 is a happy number because the sequence of operations leads to 1: */

import java.util.Scanner;

public class Program24 {
    
    public static int sumOAndSquareofallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem*rem;
        }
        System.out.println("the sum of square is "+ sum);
        return sum;
    }
    public static int happyNo(int n ){
        int count =0;
       while (n!=1) {
        
        // System.out.println(n);
          n= sumOAndSquareofallDigits(n);
            count++;
            if(count>100){
                return 0;
            }
        }
       return 1;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        if(happyNo(num)==1) System.out.println(num+" Is a happy number");
        else System.out.println(num +" Not a happy number");

        scanner.close();
    } //   PRIME No check kar

}
