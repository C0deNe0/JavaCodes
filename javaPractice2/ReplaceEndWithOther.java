import java.util.Scanner;

public class ReplaceEndWithOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = scanner.nextInt();

        System.out.println("Enter the m: ");
        int m = scanner.nextInt();
        int temp = m;
        while(m!=0){
            m =m/10;
            n =n/10;
            n = n*10;
            
        }

        n = n+ temp;
        System.out.println("the result : "+ n);


        scanner.close();
        }
    
    }
