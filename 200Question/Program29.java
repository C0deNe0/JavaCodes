
//29. Write a Program to check whether the number is an Evil Number or Not.
//positive integers having even number of 1s in there binary from such as 0,3,5,6 etc

import java.util.Scanner;

public class Program29 {
    
    public static int evilNo(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        if(evilNo(num)%2==0) System.out.println("It is evil number");
        else System.out.println("Not a evil number3");

        scanner.close();
    } //   PRIME No check kar
}
