
//count the number of set bits

import java.util.Scanner;

public class countTheNoOfSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count=0;
        while(num !=0){
            num = num&(num-1);
            count++;
        }
        System.out.println("The answer is :"+count);
        scanner.close();
    }
}
