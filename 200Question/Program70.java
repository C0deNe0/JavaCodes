
//70. Write a program to find the largest digit in a number.

import java.util.Scanner;

public class Program70 {
  
    public static void largestDigit(int n){
        int largest=0;
        int rem =0;
        while (n>0) {
            rem = n%10;
            n/=10;
            if(rem > largest) largest =rem;
            
        }
        System.out.println("The largest digit is :"+largest);
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        largestDigit(num);

        scanner.close();
    }   
}
