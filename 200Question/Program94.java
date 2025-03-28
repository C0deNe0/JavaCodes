
//Write a program to display first 10 Fermat numbers.
/*
 * A Fermat number is defined as a number of the form 2^(2^n)+1, where n is a non-negative integer. The first few Fermat numbers are 3, 5, 17, 257, and 65537, corresponding to n=0,1,2,3, and 4 respectively.
 */

import java.util.Scanner;

public class Program94 {
    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }   
        // System.out.println("the power"+p);
        return p;
    }
   
    public static int fermatNo(int n){
        return power(2,power(2, n))+1;
    }
public static void main(String[] args) {


        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for(int i =0;i<num;i++){
            System.out.print(fermatNo(i)+" ");
        }
        scanner.close();
    } 
}
