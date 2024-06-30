public class recursiveBinarSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target=3;
        int result=binarySearch(arr, target, 0, arr.length - 1);
        System.out.printf("%d is found at %d",3,result);
    }

    static int binarySearch(int[] arr,int target,int start,int end)
    {
        int mid=(start+end)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        else if(target>arr[mid])
        {
            return binarySearch(arr, target, mid+1, end);
        }
        else
        {
            return binarySearch(arr, target, start, mid-1);
        }
       
    }
   
}
