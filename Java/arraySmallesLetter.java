public class arraySmallesLetter {
    public static void main(String[] args) {
        char[] arr= {'a','b','c','y','z'};
        char target='z';
        char result=binarySearch(arr,target);
           
        System.out.println("The Ceil value is :"+result);
    }


    static char binarySearch(char[] arr,char target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
        int mid= start+(end-start)/2;
        if(target<arr[mid])
        {
            end=mid-1;
        }
        else {
            start=mid+1;
        }
    }
    if(start==arr.length)
    {
        return arr[0];
    }
    return arr[start];
}
}
