
//84 Write a program to find and print the first 10 happy numbers.

import java.util.Scanner;

public class Program84 {
    public static int sumOAndSquareofallDigits(int n){
        int sum =0,rem=0;
        while(n!=0){
            rem = n%10;
            n/=10;
            sum +=rem*rem;
        }
        // System.out.println("the sum of square is "+ sum);
        return sum;
    }


    public static int happyNo(int n ){
        int count =0;
       while (n!=1) {
        
        // System.out.println(n);
          n= sumOAndSquareofallDigits(n);
            count++;
            if(count>100){
                return 0;
            }
        }
       return 1;
    }

    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int count =0;
        int i=0;
       while(count!=num){
            if(happyNo(i)==1){
                count++;
                System.out.print(i+" ");
            }
            else System.out.print("");
            i++;
        }

        scanner.close();
    } 


    
}
