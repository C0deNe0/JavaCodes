
//Write a program to find the 2nd largest digit in a given number.

import java.util.Scanner;

public class Program73 {

    public static void secondLargestDigit(int n){
        int largest=0;
        int temp=n;
        int rem =0;
        int rev = 0;
        while (n>0) {
            rem = n%10;
            n/=10;
            // rev = rev*10+rem;
            if(rem > largest) largest =rem;
            
        }
        // n=temp;
        System.out.println("The largest digit is :"+largest);
        while (temp>0) {
            rem = temp%10;
            temp/=10;
            if(rem == largest) rem=0;
            rev = rev*10+rem;
            
        }
        largest =0;
        // System.out.println(rev);
         while (rev>0) {
            rem = rev%10;
            rev/=10;
            // rev = rev*10+rem;
            if(rem > largest) largest =rem;
            
        }
        System.out.println("The second largest number is :"+ largest);
   
    }
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        secondLargestDigit(num);

        scanner.close();
    } 
}
