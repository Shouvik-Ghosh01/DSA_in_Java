public class stringSkipStr {
    public static void main(String[] args) {
        String str="Shouvik";
        String ans=skip(str);
        System.out.println(ans);
    }

    static String skip(String str)
    {
        if(str.length()==0)
        {
            return str;
        }

        if(str.startsWith("vik"))
        {
            return skip(str.substring(3));
        }
        return str.charAt(0)+skip(str.substring(1));
    }
}
