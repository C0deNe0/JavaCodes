
//clearing the right most bit

import java.util.Scanner;

public class ClearTheLeastSetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =scanner.nextInt();

        System.out.println("The LSB removed :"+ (num&(num-1)));

        scanner.close();
    }
}
