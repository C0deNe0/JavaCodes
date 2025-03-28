
//Write a program to check a number is a cyclic or not.
/*A cyclic number is an integer in which cyclic permutations of the digits are successive
multiples of the number. The most widely known are 142857:
*/

import java.util.Scanner;

public class Program93 {
    
    public static int countAllTheDigits(int a){
        int count =0;
        while (a!=0) {
            a/=10;
            count++;
        }
        // System.out.println(count);
        return count;
    }
    public static int cyclicNo(int num,int i){
        int num2 = num*i;
        System.out.println(num);
        System.out.println(num2);
        int temp =num;
        int count=0;
        int rem1=0,rem2=0;
        while (num!=0) {
            rem1 = num%10;
            int n =num2;
            while(n!=0){
                        rem2 = n%10;
                        System.out.println(" the count of n is "+count);
                        if(rem1 !=rem2) {
                            n=n/10;
                        }else{
                            
                            count=count +1;
                            break;
                        }
                 // System.out.println(rem1+" "+rem2);
            }
            num/=10;
    }
        if((count) ==(countAllTheDigits(temp)) ){
           System.out.println("true");
           return 0;
        }
        else {
            System.out.println("False");
            return 1;
        }
}


public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = 142857;
        int flag =1;
        int count = countAllTheDigits(num);
        for(int i=1;i<=count;i++){
           if( cyclicNo(num,i)!=0) flag =0;
           else flag =1;
            
        }
        if(flag!=0) System.out.println( "\n It is cyclic Number");
        else System.out.println("not cyclic");

        scanner.close();
    } 
}
