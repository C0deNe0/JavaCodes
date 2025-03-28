import java.util.Scanner;




public class Pat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num =scanner.nextInt();

        for(int i=0;i<num;i++){
            if(i<num/2) System.out.print(i+" ");
            else System.out.print(num-i-1+" ");
        }
        
        scanner.close();
}
}