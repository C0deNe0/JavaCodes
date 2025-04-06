public class ChangeFirstAndLast {
    
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]+" ");
        System.out.println();
        
    }

    

    static void tostr(char[] ch){
        String s ="";
        for (int i = 0; i < ch.length; i++) {
            s+=ch[i];
        }
        System.out.println(s);
    }

    static void firstAndLast(char[] ch){

        ch[0]='@';
        int i=0;
        int len = ch.length-2;
            while(len >0){

                if(ch[i]==' '){
                    ch[i-1] = '#';
                    ch[i+1] = '@';
                }
                i++;
                len--;                
            }
        
        ch[ch.length-1] = '#';
        System.out.println();
        tostr(ch);
    }


    public static void main(String[] args) {
        String str = "what is your name.";
        char[] ch = str.toCharArray();

        Display(ch);
        firstAndLast(ch);

    }
}
