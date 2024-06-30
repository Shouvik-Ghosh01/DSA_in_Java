import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5};
        cyclic(arr); 
        System.out.println(Arrays.toString(arr));   
    }

    static void cyclic(int[] arr)
    {
        int i;
  
        for(i=0;i<arr.length;i++)
        {
            int ele=arr[i]-1;
            if(arr[i]!=arr[ele])
            {
                swap(arr,i,ele);
            }
        }
    }

    static void swap(int[] arr,int max,int last)
    {
        int temp;
        temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

}
