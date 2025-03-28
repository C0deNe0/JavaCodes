
//Write a program to find the nth perfect number.

import java.util.Scanner;

public class Program53 {

    public static int checkPerfectNo(long n){
        long sum =0;
        long temp = n;

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
        long i=6;
        while (num>0) {
            long res = checkPerfectNo(i);
            if(res ==1) num--;
            i++;
        }
        System.out.println(i-1);
        scanner.close();
    } 
}
