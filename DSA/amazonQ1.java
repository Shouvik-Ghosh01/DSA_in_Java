import java.util.Arrays;

public class amazonQ1 {
      public static void main(String[] args) (
        int[] arr = {1, 3, 2, 0};
        cyclic(arr);
        System.out.println(Arrays.toString(arr)); 
        int sol=result(arr); 
        System.out.println("The missing value is:"+sol); 
          
    }


    static void cyclic(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int correctIndex=arr[i];
            if(arr[i]==arr.length)
            {
                continue;
            }
            else if(arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
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

    static int result(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                return i;
            }
        }
        return arr.length;
    }    
}
