public class arrayLinearSearch {
    public static void main(String[] args) {
        int arr[] = {2, 45, 67, 10, 89};
        int x = 67;
        int result = linearSearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index " + result);
    
        
    }

static int linearSearch(int[] arr, int a){
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==a)
        {
            return i;
        }
    }
    return -1;
}
}
