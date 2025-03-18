
//Write a Program to Find nth Evil Number.

import java.util.Scanner;

public class Program65 {
    public static int evilNo(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        // return count;
        if(count%2==0) return 1;
        else return 0;
    }
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int i=0;
        while (num>0) {
            if(evilNo(i)==1)num--;
            i++;
        }
        System.out.println(i-1);

        scanner.close();
    } 
}
