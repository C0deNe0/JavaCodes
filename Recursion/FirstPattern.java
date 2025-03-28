

public class FirstPattern {

    static int i;
     static void recur(int n){
            if(n<4){
                System.out.print(n+" ");
                recur(+1);
            }
            System.out.print(n+" ");
        }
       
    
    
    public static void main(String[] args) {
        // for(int i=0;i<4;i++){
        //     System.out.print(i+" ");
        // }
        // for (int i = 4; i >-1; i--) {
        //     System.out.print(i+" ");
        // }

        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        recur(i);
    }
    
}