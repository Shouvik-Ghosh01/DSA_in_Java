public class recursionFactorial {
    public static void main(String[] args) {
        int n=5;
        int result=fact(n);
        System.out.println(result);
    }

    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
