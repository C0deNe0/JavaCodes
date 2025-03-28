
//implement afor loop which works exactly like a while loop and cal the length of the number

import java.util.Scanner;

public class Pat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        
        int count =0;
        for(;n!=0;){
            n/=10;
            count++;
            
            scanner.close();
        }
        System.out.println("The length of the number is :"+count );

    } 

}

