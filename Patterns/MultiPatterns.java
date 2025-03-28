public class MultiPatterns {


    static void d1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( i-j==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }
    }

    static void d2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( i+j==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }
    }

    static void d3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if(j==0|| i==n-1|| i-j==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }
    }

    static void d4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if(j==n-1|| i==0|| i-j==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }
    }

    static void d5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if(j==n-1|| i==0|| j==0 || i==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }
    }


    static void d6(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if(j-i==0||  i+j==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }

    }


    static void d7(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( i==n/2|| j==n/2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }
    }

    
    static void d8(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if( i==n/2&& j==n/2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();                
        }
    }
    public static void main(String[] args) {
        int n=11;
        d1(n);
        System.out.println();
        d2(n);
        System.out.println();
        d3(n);
        System.out.println();
        d4(n);
        System.out.println();
        d5(n);
        System.out.println();
        d6(n);
        System.out.println();
        d7(n);
        System.out.println();
        d8(n);

    }
}
