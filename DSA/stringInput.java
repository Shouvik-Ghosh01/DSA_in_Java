
import java.util.Scanner;

public class stringInput {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= scan.nextInt();
        System.out.println("Enter the string:");
        scan.nextLine();
        String str =scan.nextLine();
        System.out.println("The entered number is "+a+" and the string is \""+str+"\"."); 
}
}
    