import java.util.Scanner;

public class ExceptLastNumber {
    

    public int otherNum(int number){

        int remainging =number/10;
        return remainging;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptLastNumber t = new ExceptLastNumber();

        System.out.println("enter a number:");
        int number = scanner.nextInt();

        System.out.println(t.otherNum(number));

        scanner.close();
    }


}
