public class factorial {
    public static void main(String[] args) {
        int n=;
        int result=fact(n);
        System.out.println(result);
    }

    static int fact(int n)
    {
        if(n<2)
        {
            return n;
        } 

        return fact(n-1)+fact(n-2);
    }
}
