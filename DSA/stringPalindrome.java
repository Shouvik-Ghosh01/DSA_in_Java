import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(check(str));
    }

    static boolean check(String str)
    {
        
        int start=0;
        int last=str.length()-1;
        while(start<=last)
        {
            if(str.charAt(start)!=str.charAt(last))
            {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
