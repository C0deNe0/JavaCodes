import java.util.Scanner;

//33. Write a program to find out all Armstrong numbers present within a given range.

public class Program33 {
    
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
        int temp =n;
        int rem=0,sum=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            sum = sum +power(rem, count);
        }
        // System.out.println("the sum "+sum);
        // return sum;
        if(sum == temp ) return 1;
        else return 0;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int range = scanner.nextInt();

        for(int i=0;i<range;i++){
            if(checkArmstrong(i)==1) System.out.print(i+" ");
            else System.out.print("");
        }
        scanner.close();
    } //   PRIME No check kar
}
