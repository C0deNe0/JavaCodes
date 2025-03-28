import java.util.Scanner;

public class CheckForPowerOF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no :");
        int num = scanner.nextInt();

        if((num & (num-1)) == 0) System.out.println("It is a power of 2");
        else System.out.println("Not a power of 2");
        scanner.close();
    }    
}
