import java.util.Scanner;

//implement a while loop which works like a for loop and print multiplication table of n number




public class Pat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
         int i=1;
         while(i<=10){
            System.out.println(num +"*"+i+"="+num*i);
            i=i+1;
         }
         scanner.close();

    }
}
