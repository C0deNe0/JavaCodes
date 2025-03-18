import java.util.Scanner;

//wap to find the nth palindrome number

public class Program48 {
    
    public static int reverse(int n){
        int rem=0,rev=0;
        while (n!=0) {
            rem = n%10;
            n/=10;
            rev= rev*10+rem;            
        }
        return rev;
    }
     
    public static int palindrome(int n){
        int rev = reverse(n);
        if(n ==rev){
           return 1;
        }
        else{
            return 0;
        }
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a nth : ");
        // int range = scanner.nextInt();
        int nth = scanner.nextInt();    
        int i=0;
        
        while ( nth>0 ) {
            int res =palindrome(i);
            if(res == 1) {
                // System.out.print(nth+" ");
                nth--;
            }
            i++;
        }
        System.out.println("The nth position palindrome is : "+( i-1));
        scanner.close();
    } //   PRIME No check kar
}
