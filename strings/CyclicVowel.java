public class CyclicVowel {
    
    static String tostr(char[] ch){
        String s ="";
        for (int i = 0; i < ch.length; i++) {
            s+=ch[i];
        }
       return s;
    }

    static char isv(char a){
        char v[] ={'a','e','i','o','u'};
        for (int i = 0; i < 5; i++) {
            if(v[i]==a)
                return v[(i+1)%5];
        }
        return '0';
    }

    static String vowel(char a[]){
        for (int i = 0; i < a.length; i++) {
                char t=isv(a[i]);
                if(t!='0')
                    a[i]=(char)(t-32);
        }
        return tostr(a);
    }

    

    public static void main(String[] args) {
        String s = "what is your name";
        char[] a =s.toCharArray();
        
      System.out.println( vowel(a));
    }
}
