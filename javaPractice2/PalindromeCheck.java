
import java.util.Scanner;

public class PalindromeCheck {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int checkNum = num;
        int rem =0,rev=0;
        while(num!=0){
            rem = num%10;
            num = num/10;
            rev= rev*10+rem;
        }
        System.out.println(rev);
        if(checkNum == rev){
            System.out.println("It is a palindrome!");
        }else{
            System.out.println("NOt a Palindrome");
        }

        scanner.close();
    }
}
