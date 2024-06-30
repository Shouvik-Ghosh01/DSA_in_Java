public class recurssionsumofDigits {
    public static void main(String[] args) {
        int n=123;
        int result =sum(n);
        System.out.println(result);
    }
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem=n%2;
        n=n/2;
        return rem+sum(n);
    }
}
