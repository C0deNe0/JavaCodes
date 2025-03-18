
//all Neon Number up to the range 

//THis is useless because there are only three neon number till date

import java.util.Scanner;

public class Program40 {
    
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

       if(num>=9) System.out.println(0 +" "+1+" "+9);
       else if(num>0&&num<9) System.out.println(0+" "+1);
       else System.out.println(0);
        scanner.close();
    } //   PRIME No check kar
    
}
