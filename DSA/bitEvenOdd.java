import java.util.Scanner;
public class bitEvenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            System.out.println(check(num));
        }

    }


        static boolean check(int num)
        {
            return (num | 0) ==0;
        }
        
}
