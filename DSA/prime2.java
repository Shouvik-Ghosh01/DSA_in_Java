public class prime2 {
    public static void main(String[] args) {
        int no=8;
        for(int i=0;i<=no;i++)
        {
        System.out.println(isPrime(i));
        }
    }

    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else{
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

//Time Complexity : root(n)