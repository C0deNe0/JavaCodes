
//Write a program to find the nth prime number.

import java.util.Scanner;

public class Program49 {
    
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
        int i=1;
        while (num>0) {
            int res = primeNo(i);
            if(res ==0) num--;
            i++;
        }
        System.out.println("The nth position number is "+(i-1));

        scanner.close();
    } //   PRIME No check kar

}
