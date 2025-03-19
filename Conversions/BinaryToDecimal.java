
//Binary to decimala conversions

import java.util.Scanner;

public class BinaryToDecimal {
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
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a Binnary number : ");
        int bi = Scanner.nextInt();
       
        System.out.println("The decimal converted binary is : "+biToDeci(bi));
        Scanner.close();
    }
}
