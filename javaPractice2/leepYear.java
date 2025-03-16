import java.util.Scanner;

public class leepYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if( year%400 ==0 || (year% 4 ==0 && year%100 != 0)){
            System.out.println("this is a leep year");
        }
        else{
            System.out.println("Not a leep year");
        }
    

        scanner.close();
    }

}
