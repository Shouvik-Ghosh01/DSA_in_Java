import java.util.Arrays;

public class array2dReverse {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{0,1,1},{1,1,1}};
        reverse(arr);
    }

    static void reverse(int[][] arr)
    {
        for(int[] num : arr)
        {
            int start=0;
            int end=num.length-1;
            int temp;
            while(start<=end)
            {
                temp= num[start] ^ 1;
                num[start]=num[end] ^ 1;
                num[end]=temp;
                start++;
                end--;
            }
        }

       


        for(int[] num : arr)
        {
            
                System.out.println(Arrays.toString(num));
        }
        
    }
}
