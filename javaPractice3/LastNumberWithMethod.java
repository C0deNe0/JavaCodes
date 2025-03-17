import java.util.Scanner;

public class LastNumberWithMethod {

    public int lastdigit(int num){
        // System.out.println(num);
        int lastNo = num%10;
        return lastNo;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        LastNumberWithMethod t = new LastNumberWithMethod();
        System.out.println(t.lastdigit(num));

        scanner.close();
    }
}
