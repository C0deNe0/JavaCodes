import java.util.Scanner;

//All sunny number in a given range


public class Program43 {



    public static int checkPerfectSquare(int n){
        int i=0;
        int count =0;

        while (!(i*i==n)) {
            if(count>100){
                return 0;
            }
            count++;
            i++;
        }
        // System.out.println(i);
        return i;
    }




public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

      for(int i=0;i<num;i++){
        if(checkPerfectSquare(i+1)==0){
            System.out.print("");
           }else{
                System.out.print(i+" ");
           }
      }

      

        scanner.close();
    } 
}
