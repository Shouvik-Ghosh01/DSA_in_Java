import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1,2,1, 7,10, 8, 9};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int start,int end)
    {
        if(start>=end){
            return;
        }
        int si=start;
        int ei=end;
        int pivot=si+(ei-si)/2;
    

        while(si<=ei){
        while(arr[si]<arr[pivot])
        {
            si++;
        }   
        while(arr[ei]>arr[pivot])
        {
            ei--;
        }
        if(si<=ei)
        {
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
        sort(arr,start,ei);
        sort(arr,si,end);
    
    }
}
