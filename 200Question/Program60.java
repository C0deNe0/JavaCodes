
//Write a Program to Find nth Happy Number.

import java.util.Scanner;

public class Program60 {
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

        int i=0;
        while (num>0) {
            if(happyNo(i)==1)num--;
            i++;
        } 
        System.out.println(i-1);
        scanner.close();
    } 

}
