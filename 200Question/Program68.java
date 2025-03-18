
//Write a program to find out how many 1 and 0 in a given number.

import java.util.Scanner;

public class Program68 {
    

    public static void checkForOneAndZero(int n){
        
        int rem=0;
        int count1 =0,count2=0;
        while (n>0) {
         rem = n%10;
         n/=10;
         if(rem ==1) count1++;
         if(rem ==0) count2++;
        }

        System.out.println("The number of one's :"+count1);
        System.out.println("The number of two's :"+count2);
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number(should not start with zero) : ");
        int num = scanner.nextInt();
        checkForOneAndZero(num);

        scanner.close();
    } 
}
