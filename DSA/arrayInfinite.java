public class arrayInfinite {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,12,16,18,19};
        int target=8;
        System.out.println(ans(arr,target));       

    }

    static int ans(int[] arr, int target)
    {
        int start=0;
        int end=1;
        while(target>end)
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        int result=binarySearch(arr,target,start,end);
        return result;
    }

    static int binarySearch(int[] arr,int target,int start,int end)
    {

        while(start<=end){
        int mid= start+(end-start)/2;

        if(arr[mid]==target)
        {
            return arr[mid];
        }
        else if(target<arr[mid])
        {
            end=mid-1;
        }
        else {
            start=mid+1;
        }
    }
    return arr[start];
}
}
