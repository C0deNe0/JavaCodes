
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
        int n = num*i;
        System.out.println(n);
        int temp =num;
        int count=0;
        int rem1=0,rem2=0;
        while (num!=0) {
            rem1 = num%10;
            num/=10;
            while(n!=0){
                rem2 = n%10;
                n/=10;
                // System.out.println(rem1+" "+rem2);
                if(rem1 ==rem2) count++ ;
            }
        }
        // System.out.println(" the count of n is "+count);
        if(count ==countAllTheDigits(temp)) return 1;
        else return 0;
    }

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = 12857;
        int flag =0;
        int count = countAllTheDigits(num);
        for(int i=1;i<=count;i++){
           if( cyclicNo(num,i)!=0) flag =1;
           else flag =0;
            
        }
        if(flag!=0) System.out.println( "\n It is cyclic Number");
        else System.out.println("not cyclic");

        scanner.close();
    } 
}
