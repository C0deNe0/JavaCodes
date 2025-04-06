public class Vowels {


    static void tostr(char[] ch){
        String s ="";
        for (int i = 0; i < ch.length; i++) {
            s+=ch[i];
        }
        System.out.println(s);
    }



    public static void main(String[] args) {
        String s = "what is your name";
        char[] a =s.toCharArray();
        int i=0;
        while (i<s.length()) {
            
            if(a[i]=='a' ||a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u'){
                a[i]=(char)(a[i]-32);
            }
            i++;
        }
        tostr(a);
    }
}
