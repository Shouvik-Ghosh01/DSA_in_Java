public class stringSkip {
    public static void main(String[] args) {
        String str="shauvik";
        String ans=skip(str);
        System.out.println(ans);
    }

    static String skip(String str)
    {
        if(str.length()==0)
        {
            return str;
        }
        char ch=str.charAt(0);
        if(ch=='a')
        {
            return skip(str.substring(1));
        }
        return ch + skip(str.substring(1));
    }
}
