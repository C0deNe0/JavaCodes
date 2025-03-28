
//100 Write a program to create the first twenty Hamming numbers.

import java.util.Scanner;

public class Program100 {
    

        public static int uglyNum(int n){
            while (n>1) {
                
                if(n%2==0) {
                    // System.out.print(2+" ");
                    n/=2;
                }
                else if(n%3==0){ 
                    // System.out.print(3+" ");
                n/=3;}
                else if(n%5==0) {
                    // System.out.print(5+" ");
                    n/=5;
                }
                else return 0;
                
        }
        return 1;
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        // int num = scanner.nextInt();
        int count=1;
        int i=1;
        while(count!=40) {
            
            
            if (uglyNum(i)==1) {
                System.out.print(i+" ");
            }else{
                System.out.print("");
            }
            count++;
            i++;
        }
        scanner.close();
    } 
}
