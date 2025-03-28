
//Write a Program to check whether the number is a Pronic Number or Not.

import java.util.Scanner;

public class Program27 {
    

     public static int pronicNo(int n){
        
        if(n==0){
            return 1;
        }
        for(int i=0;i<n/2;i++){
            if( i*(i+1)==n ){
                return 1;
            }
        }
        return 0;
     }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        if(pronicNo(num)==1) System.out.println("Pronic Number");
        else System.out.println("Not a Pronic Number");

        scanner.close();
    } //   PRIME No check kar
}
