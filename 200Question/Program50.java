
//Write a Program to Find nth Perfect Square Number.

import java.util.Scanner;

public class Program50 {
    public static int checkPerfectSquare(int n){
        int i=0;
        int count =0;

        while (!(i*i==n)) {
            if(count>100){
                // System.out.println("NOT a perfect sqaure");
                return 0;
            }
            count++;
            i++;
        }
        // System.out.println(i);
        return 1;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int i=0;
        while (num>0) {
            int res = checkPerfectSquare(i);
            if(res==1) num--;
            i++;
        }
        System.out.println(i-1);
        scanner.close();
    }
}
