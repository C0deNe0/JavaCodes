import java.util.Scanner;

// Write a program to check whether a given number is an Automorphic number or not.
//An automorphic number is an integer whose square ends with the given integer. For example, 5^2=25 and 6^2=36

public class Program19 {

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

        int square=num*num;
       if( square% power(10, countTheDigits(num))==num){
            System.out.println("it is a automorphic number");
       }else{
        System.out.println("not a automorphic number");
       }


        scanner.close();
    } //   PRIME No check kar
}
