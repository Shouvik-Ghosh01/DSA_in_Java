import java.util.Scanner;


public class armstringno {
   public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        System.out.println(check(n));
    }
   }

   static boolean check(int n)
   {
    int sum=0;
    int rem;
    int temp=n;

    while(n>0)
    {
        rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
    }
    if(sum==temp)
    {
        return true;
    }

    return false;
   }
}
