// NeoN Number  => those whose sum of digits of its square is equal to the same number.

import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num==0|| num ==1 || num ==9){
            System.out.println("It is an Neon Number");
        }else{
            System.out.println("NOt a neon number");
        }


        scanner.close();

    }
}
