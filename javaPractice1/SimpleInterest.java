import java.util.Scanner;

public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p: ");
        float p = sc.nextFloat();
        System.out.println("Enter the value of r: ");
        float r = sc.nextFloat();
        System.out.println("Enter the value of t: ");
        float t = sc.nextFloat();

        System.out.println("The simple Interest is :"+ ((p*r*t)/100));

        sc.close();
    }
}
