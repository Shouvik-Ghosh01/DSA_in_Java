public class powerof2 {
    public static void main(String[] args) {
        int n=47;
        boolean result=isPowerOfTwo(n);
        System.out.println(result);
    }

    static boolean isPowerOfTwo(int n)
    {
        int count =0;
        while(n>0)
        {
            int last=n & 1;
            if(last==1)
            {
                count++;
            }
           n= n>>1;
        }
        if(count>1)
        {
            return false;
        }
        return true;
    }
}
