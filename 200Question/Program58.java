
//Write a Program to Find nth Neon Number.
//Again a waste question to ask As THERE ARE ONLY THREE NEON NUMBER 0 ,1 ,9 and there are no other neon number than infinity

import java.util.Scanner;

public class Program58 {
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if(num==1) System.out.println(0 );
       else if(num ==2) System.out.println(1);
       else if(num == 3)System.out.println(9);
       else System.out.println("There are only three neon number 0, 1, 9");
        scanner.close();

        scanner.close();
    } 
}
