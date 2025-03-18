
//Write a program to check whether a given number is a Disarium number or unhappy number.

import java.util.Scanner;

public class Program86 {
    
    public static int countAllTheDigits(int a){
        int count =0;
        while (a!=0) {
            a/=10;
            count++;
        }
        // System.out.println(count);
        return count;
    }


    public static int pow(int a,int b){
        int p=1;
        while(b!=0){
            p*=a;
            b--;
        }
        // System.out.println(p);
        return p;
    }

    public static int disariumNo(int n){
        int count = countAllTheDigits(n);
        int temp =n;
        int rem=0,sum=0;
        while (n!=0) {
            rem =n%10;
            n/=10;
            sum+=pow(rem,count);
            count--;
        }
       if(sum ==temp ) return 1;
       else return 0;
    }
    


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

        if(happyNo(num)==1  && disariumNo(num)==1){
            System.out.println(" The number is Both");
        } 
        else if(!( disariumNo(num)==1)) System.err.println("not a disarium number");
        else if( !(happyNo(num)==1)) System.out.println("not a happy number");
        else if(disariumNo(num)==1 ) System.out.println("It is a disamium number");
        else System.out.println("happy number");

        scanner.close();
    } 
}
