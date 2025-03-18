
//. Write a program to check whether a number is a Duck Number or not.

import java.util.Scanner;

public class Program89 {
    
    public static int duckNo(String num){
        int rem=0;
        // System.out.println(num.charAt(0));

        if(num.charAt(0)=='0'){
            return 0;
        }
        else{
            int n = Integer.parseInt(num);
            while (n!=0) {
                rem= n%10;
                n/=10;
                if(rem ==0){
                    return 1;
                }
            }
            
        }
        return 0;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = scanner.nextLine();;

        if(duckNo(num)==1) System.out.println("It is a duck number");
        else System.out.println("It is a NOT duck number");
       
        scanner.close();
    } 
}
