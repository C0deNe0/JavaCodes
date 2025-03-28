
//wap to print first pell series

import java.util.Scanner;

public class Program98 {
    
    public static int pellNo(int a,int b){
        int newPell = 2*a +b;
        return newPell;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        int p0=0;
        int p1 =1;
        int count =0;
        System.out.print(p1+" ");
       while (count!=num-1) {
        int temp =p1;    
        p1=2*p1+p0;
        p0=temp;
        System.out.print(p1 +" ");
        count++;
       }


        scanner.close();
    } 

}
