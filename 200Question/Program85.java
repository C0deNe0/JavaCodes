
//Write a program to check whether a given number is a happy number or unhappy number.

import java.util.Scanner;

public class Program85 {
    
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
    //     int count =0;
    //     int i=0;
    //    while(count!=num){
    //         if(happyNo(i)==1){
    //             count++;
    //             System.out.print(i+" ");
    //         }
    //         else System.out.print(i+" ");
    //         i++;
    //     }
        if(happyNo(num)==1) System.out.println("The number is happy Like darshan ");
        else System.out.println("The number is unHappy Like Naveen ");

        scanner.close();
    } 


}
