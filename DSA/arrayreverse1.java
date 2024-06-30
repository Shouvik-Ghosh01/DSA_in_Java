public class arrayreverse1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        reverse(arr);
    }

    static void reverse(int[] arr)
    {
        int j=0;
        int k=arr.length-1;
        while(j<k)
        {
            int temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
            j++;
            k--;
        }
        for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
    
}
