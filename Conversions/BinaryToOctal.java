
// converting Binary number to octal

import java.util.Scanner;

public class BinaryToOctal {


    public static int countTheDigits(int x){
        int count=0;
        while (x>1) {
            x/=10;
            count++;            
        }
        // System.out.println("The count is :"+count);
      return count;
    }
    public static int pow(int a ,int b){
        int p=1;
        while(b!=0){
            p=p*a;
            b--;
        }   
        // System.out.println("the power"+p);
        return p;
    }

    public static int biToDeci(int bi){
        int rem=0,sum=0;
        int count = countTheDigits(bi);
           while(bi>0){
            rem =bi%10;
            sum+= rem*pow(2,count);
            bi/=10;
            count--;
        }
        return sum;
    }

    
    public static int deciToOct(int num){
        int rem =0;
        int rev=0;
        int power =1;
        
        while(num!=0){
            rem = num%8;
            
            rev=rev +(rem*power);
            power = power*10;
            num=num/8;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        int x= biToDeci(num);
        System.out.println("The result is :"+deciToOct(x));
        scanner.close();
    }
}
