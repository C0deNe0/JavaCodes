
import java.util.Scanner;

public class ToggleTheIthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int ith = scanner.nextInt();

        int temp = 1<<ith-1;
         num = num ^ temp;
        System.out.println("The toggled value is :"+num );
        scanner.close();
    }    
}
