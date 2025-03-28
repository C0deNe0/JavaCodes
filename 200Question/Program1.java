// 1. Write a program to the sum of n natural numbers.
import java.util.Scanner;
public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int sum =0;
        for(int i=0;i<=num;i++){
            sum =sum +i;
        }
        System.out.println("the result is : "+sum);
        scanner.close();
        
    }
}