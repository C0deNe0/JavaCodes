

public class AllLinePatterns {
    public static void main(String[] args) {
        int n=17;//1 5

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i==0 || j==n-1 || i==n-1 ||
                   i-j==0 || i+j==n-1 || i==n/4 || i==3*n/4 ||
                   i==n/2 || j==n/2 || j==n/4 || j==3*n/4 ||
                   i+j==n/2 || i-j==-n/2 || i-j==n/2 || i+j==3*(n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }    
}
