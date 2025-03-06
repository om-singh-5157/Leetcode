public class problem344 {
    public static void main(String[] args) {
        char s[]={'H','a','n','n','a'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        int c=s.length-1;
        for(int i=0;i<(s.length/2)-1;i++){
            char temp=s[i];
            s[i]=s[c];
            s[c]=temp;
            c--;
        }
        for(char ch:s){
            System.out.print(ch);
        }
    }
}