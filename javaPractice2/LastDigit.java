import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter a number :");
     int num = scanner.nextInt();
      int temp = num;
     num = num%10;
     System.out.println("The last digit is :"+ num);
     
     
     temp =temp /10;
     System.out.println("The remainging number is "+temp);

     scanner.close();
    }
}
