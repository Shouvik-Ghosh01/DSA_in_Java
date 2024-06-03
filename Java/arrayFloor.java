public class arrayFloor {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,7,10,19};
        int target=11;
        int result=binarySearch(arr,target);
           
        System.out.println("The Ceil value is :"+result);
    }


    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

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
    return arr[end];
}
}
