public class Program11 {



    static String incdec(char[] a){
        int flag =0;
        String r ="";

        for (int i = 0; i < a.length; i++) {
            if(a[i]==' '){
                r=r+' ';
                flag=0;
            }

            else if(flag==0 && a[i]=='a' || a[i]=='e' || a[i]=='i'|| a[i]=='o' || a[i]=='u'){
                r+=(char)(a[i]-32);
                flag =1;
            }
            else if(flag ==0){
                r+=(char)(a[i]-1);
            }
            else{
                r+=(char)(a[i]+1);
            }
        }

        return r;
    }
    public static void main(String[] args) {
        String s = "what is your name";
        char[] a = s.toCharArray();

        System.out.println(s);
        System.out.println(incdec(a));
    }
}
