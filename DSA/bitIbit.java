public class bitIbit {
    public static void main(String[] args) {
        int n=9;
        int i=3;
        byte result =search(n,i);

        System.out.println(result);
    }

    static byte search(int n,int i)
    {
        int mask=1<<i-1;
        return (byte) (n & mask);
    }
}

