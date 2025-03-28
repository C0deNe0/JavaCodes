import java.util.Scanner;

public class NumberConcatination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first no: ");
        int n = scanner.nextInt();
        System.out.println("Enter the second no: ");
        int m = scanner.nextInt();
        int temp =m;

        while(m!=0){
        n= n*10;
        m =m/10;
        }
        n = n +temp;



        System.out.println("the result:"+n);
        scanner.close();
    }
}
