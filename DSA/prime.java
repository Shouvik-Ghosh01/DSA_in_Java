 import java.util.*;

public class prime {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();       
        int m=n/2;
        int flag=0;


        if(n==1 || n==0)
        {
            System.out.println("not prime");
        }
        else{
            for(int i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println("not prime");
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }

    }
}
