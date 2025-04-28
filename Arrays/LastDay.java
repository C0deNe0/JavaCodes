import java.util.Scanner;

public class LastDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i]= scanner.nextInt();
        }

        System.out.println("The reverse of the array: ");
        for (int i = 0; i < size; i++) {
            a[i]=size-i;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(a[i]+" ");
        }

        scanner.close();
    }
}
