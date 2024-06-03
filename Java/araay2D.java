

import java.util.Scanner;
public class araay2D {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for 2D array:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("\nEnter elements of 2D array row by row:\n");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] num:arr)
        {
            for(int num2:num)
            {
                System.out.print(num2+" ");
            }
            System.out.println();
        }
    }
}
