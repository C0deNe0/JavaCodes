
//Write a program to count the number of digits in an integer.

import java.util.Scanner;


public class program4 {


    public static int countTheDigits(int x){
        int count=0;
        while (x!=0) {
            x/=10;
            count++;            
        }
        System.out.println("The count is :");
      return count;
    }


     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println(countTheDigits(num));

        scanner.close();
    }
}
