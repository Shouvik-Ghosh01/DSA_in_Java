public class bitNthMagicnum {
    public static void main(String[] args) {
        int n=3;
        int result =check(n);
        System.out.println(result);
    }

    static int check(int n)
    {
       
        int sum =0;
        int base=5; //important
        while(n>0)
        {
            int last= n & 1;            
            sum = sum + last * base;
            base=base*base;
            n=n>>1;
        }
    
        return sum;
    }
}
