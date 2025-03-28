
//Write a program to find out all Perfect numbers present within a given range.

import java.util.Scanner;

public class Program35 {
    
    public static int checkPerfectNo(int n){
        int sum =0;
        int temp = n;

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum == temp) return 1;
        else return 0;
    }

    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for(int i=0;i<num;i++){
            if(checkPerfectNo(i)==1) System.out.print(i + " ");
            else System.out.print("");
        }

        scanner.close();
    } //   PRIME No check kar
}
