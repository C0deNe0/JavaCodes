
//Write a program to find out all primes numbers present within a given range.

import java.util.Scanner;

public class PRogram31 {
    public static int primeNo(int n){
        int i;
        for(i=2;i*i<=n;i++){
            if(n%i==0) return 1;
        }
        return 0;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        if (num ==0||num==1) {
                System.out.println("Enter a number greater than 2");
        }
        for(int i=2;i<=num;i++){
            if(primeNo(i)==0){
                System.out.print(i+" ");
            }
            System.out.print("");
        }

        scanner.close();
    } //   PRIME No check kar

}
