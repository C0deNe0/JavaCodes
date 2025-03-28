
//Write a Program to check whether the number is Disarium Number or Not.
/*
 * A Disarium number is an integer where the sum of each digit raised to the power of its position in the number equals the number itself.
 For example, 135 is a Disarium number because 1^1+3^ 2+5^3 =135.
 */
import java.util.Scanner;

public class Program26 {

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
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        
        if(disariumNo(num)==1) System.out.println("This is a disarmium number");
        else System.out.println("Not a disarmium number");
        

        scanner.close();
    } //   PRIME No check kar
}
