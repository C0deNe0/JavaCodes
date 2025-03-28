import java.util.Scanner;

//Write a Program to Find nth Abundant Number.

public class Program55 {
    public static int checkAbundantNo(int n){
        int sum= 0,temp=n;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }

        }
        if(sum>temp) return 1;
        else return 0;
}  
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        int i=0;
        while (num>0) {
            int res = checkAbundantNo(i);
            if(res ==1) num--;
            i++;            
        }
        System.out.println(i-1);

        scanner.close();
    } 
}
