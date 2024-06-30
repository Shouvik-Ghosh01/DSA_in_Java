public class arrayReverse {
    public static void main(String[] args) {
        int[] arr={1,23,45,67};
        rev(arr);
        System.out.println("The reversed array is:");
        for(int num:arr)
        {
            System.out.print( num+" ");
        }

    }

    static void rev(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
