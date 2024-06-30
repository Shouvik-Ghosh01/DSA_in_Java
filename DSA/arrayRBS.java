public class arrayRBS {
    public static void main(String[] args) {
        int[] arr={5,6,7,1,2,3,4};
        int result=search(arr);
        System.out.println("Number of rotations: "+result);
        }

    static int search(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                return mid+1;
            }
            else if(arr[mid]<arr[mid-1])
            {
                return mid;
            }
            else if(arr[start]>arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }   
}
