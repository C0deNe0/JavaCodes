
//83 Write a program to print out the first 10 Catalan numbers by extracting them from Pascal's triangle.

import java.util.Scanner;

public class Program83 {



    public static long factorial(long x){
        if( x ==0){
            return 1;
        }
        return x*factorial(x-1);
    }



    public static void catlanNo(long n){
        // if(n <3 ) {
        //     System.out.println(n+" ");
        // }
        if(n>=0){

            
            long res =((factorial(2*n)) / (factorial(n)*factorial(n+1)));
            System.out.print(res+" ");
        }
            
        }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long num = scanner.nextInt();

        for (long i = 1; i <= num; i++) {
            catlanNo(i);
        }

        scanner.close();
    }     
}
