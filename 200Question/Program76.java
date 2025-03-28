
/*Write a program to check whether a given number is an ugly number.
In number system, ugly numbers are positive numbers whose only prime factors are 2,
3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is
included. */

import java.util.Scanner;

public class Program76 {


        public static int uglyNum(int n){
            while (n>1) {
                
                if(n%2==0) {
                    System.out.print(2+" ");
                    n/=2;
                }
                else if(n%3==0){ System.out.print(3+" ");
                n/=3;}
                else if(n%5==0) {
                    System.out.print(5+" ");
                    n/=5;
                }
                else return 0;
                
        }
        return 1;
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        if (num==1) {
            System.out.println(1);
        }
       if (uglyNum(num)==1) {
            System.out.println("\nIt is a ugly number");
       }else{
        System.out.println("\nNot a ugly number");
       }
        scanner.close();
    } 
}
