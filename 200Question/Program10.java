
//10. Write a Program to calculate prime Factors of number.

import java.util.Scanner;

public class Program10 {

    public static void primeFactors(int n){

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
        else {System.out.print(n);
            break;}
        } 
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        
        primeFactors(num);
        
        scanner.close();
    } 
}

