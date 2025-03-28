
// ith bit is set or not

import java.util.Scanner;

public class checkIthSetBit {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = scanner.nextInt();
        int ith= scanner.nextInt();

        int temp=1;
        temp =temp<<ith-1;
        System.out.println(temp);
        if((num & temp)==temp) System.out.println("The ith bit is set");
        else System.out.println("The ith bit is not set");
        scanner.close();
    }    
}
