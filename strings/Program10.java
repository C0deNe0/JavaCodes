
public class Program10 {
        
    static int ml(char a[]){
        int n=a.length,ml=n;
        int c=1;
        for(int i=0;i<n;i++){
            if(i==n-1 || a[i+1]==' '){
                if(ml>c)
                    ml=c;
                c=0; //reset
                }
                else
                    c++;  //inc
        }
        return ml;
    }
    static String newword(char a[]){
        String r="";
        for(int j=1;j<ml(a)+1;j++){
            for(int i=j-1;i<a.length;i++){
                if(i==j-1 || a[i-j]==' ' )
                    r=r+(char)(a[i]-32);
            }
            r+=' ';
        }
        return r;
    }
    public static void main(String[] args) {
        String s="what is your name";
        char a[]=s.toCharArray();
        System.out.println(newword(a));
       
    }
}
 
