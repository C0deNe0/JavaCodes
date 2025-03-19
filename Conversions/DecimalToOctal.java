
// DEcimal  to octal

import java.util.Scanner;

public class DecimalToOctal {

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
        System.out.println("ENter a number");
        int num =scanner.nextInt();


        System.out.println(deciToOct(num) );
        scanner.close();
    }
}
