import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selection(arr); 
        System.out.println(Arrays.toString(arr));   
    }


    static void selection(int[] arr)
    {
       
        for(int i=0;i<arr.length;i++)
        {        
            int last=arr.length-i-1;
            int maxIndex=maxelement(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int max,int last)
    {
        int temp;
        temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    static int maxelement(int[] arr,int start,int last)
    {
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
        }
        }
        return max;
    }
}
