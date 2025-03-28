import java.util.Scanner;

public class FirstNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int remainder=0,reverse=0;
        while(num!=0){
           remainder = num%10;
           num = num/10;
           reverse = reverse*10+remainder;
           
       }

       int firstNum = reverse%10;
       System.out.println("the first Number :"+firstNum);

       scanner.close();
    }
}
