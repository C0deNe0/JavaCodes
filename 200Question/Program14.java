import java.util.Scanner;

//Write a program to check whether a given number is an Armstrong number or not.
/*is a positive integer that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3+5^3+3^3=153. */


public class Program14 {
    
    public static int countTheDigits(int x){
        int count=0;
        while (x!=0) {
            x/=10;
            count++;            
        }
        // System.out.println("The count is :"+count);
        return count;
    }

    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }   
        // System.out.println("the power"+p);
        return p;
    }

    public static int checkArmstrong(int n){
        int count = countTheDigits(n);
        
        int rem=0,sum=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            sum = sum +power(rem, count);
        }
        // System.out.println("the sum "+sum);
        return sum;
        // if(sum == temp ) return 1;
        // else return 0;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        // System.out.println("Result :"+checkArmstrong(num));
        if(checkArmstrong(num) ==num) System.out.println("This is a Armstrong number");
        else System.out.println("This is Not a Armstrong Number");
        scanner.close();
    }
}
