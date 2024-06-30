import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={2,5,7,1,5,8,9};
        int[] newar=bubble(arr);
        System.out.println(Arrays.toString(newar));
    }

    static int[] bubble(int[] arr)
    {
        boolean swapped;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            swapped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            if(swapped==false)
        {
            break;
        }
        }
        
        return arr;
    }
}
