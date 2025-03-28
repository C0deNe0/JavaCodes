
//Write a program to check whether a given number is a perfect square number or not.


//                    root(n)                               


import java.util.Scanner;

public class Program13 {

    public static int checkPerfectSquare(int n){
        int i=0;
        int count =0;

        while (!(i*i==n)) {
            if(count>100){
                System.out.println("NOT a perfect sqaure");
                return 0;
            }
            count++;
            i++;
        }
        System.out.println(i);
        return i;
    }
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        System.out.println("The result : "+ checkPerfectSquare(num));

        scanner.close();
    }
}
