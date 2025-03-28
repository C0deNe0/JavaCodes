
//32. Write a program to find out all perfect square numbers present within a given range.

import java.util.Scanner;

public class Program32 {

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

        for(int i=2;i<=num;i++){
            if(checkPerfectSquare(i)==0) System.out.print("");
            else System.out.print(i+" ");
        }

        scanner.close();
    } //   PRIME No check kar
}
