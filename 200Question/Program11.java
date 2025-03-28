import java.util.Scanner;

public class Program11 {

    
    public static int reverse(int n){
        int rem=0,rev=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            rev= rev*10+rem;            
        }
        return rev;
    }
     
    public static boolean palindrome(int n){
        int rev = reverse(n);
        if(n ==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println("The result:"+palindrome(num));
        scanner.close();
    }
}
