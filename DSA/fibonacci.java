public class fibonacci {
    public static void main(String[] args) {
        int n=5;
        fibonacci(n);
       
    }

    static void fibonacci(int n)
    {
        int int1=0;
        int int2=1;
        System.out.print(int1+""+int2);
        
        for(int i=2;i<n;i++)
        {
           
            int int3=int1+int2;
            int1=int2;
            int2=int3;
            System.out.print(int3);
        }    
    
    }
}
