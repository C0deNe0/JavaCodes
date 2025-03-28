
/*
 * write a program to check a number is a cube or not.
In arithmetic and algebra, the cube of a number n is its third power: the result of the
number multiplied by itself twice:
 */

import java.util.Scanner;

public class Program92 {

    public static int cubeNo(int num){
        return num*num*num;
    }
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println(cubeNo(num));
        scanner.close();
    } 
    
}
