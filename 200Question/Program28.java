
//Write a Program to check whether the number is a Trimorphic Number or Not.
/*A trimorphic number is a number whose cube ends in the number itself. For example, 4 is a trimorphic number because 4^3 =64, which ends in 4 */

import java.util.Scanner;

public class Program28 {
    
    public static int power(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }  
        return p;
    }
    
    public static int countTheDigits(int x){
        int count=0;
        while (x!=0) {
            x/=10;
            count++;            
        }
        // System.out.println("The count is :"+count);
        return count;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int square=num*num*num;
        if( square% power(10, countTheDigits(num))==num){
             System.out.println("it is a Trimorphic number");
        }else{
         System.out.println("not a Trimorphic number");
        }

        scanner.close();
    } //   PRIME No check kar

}
