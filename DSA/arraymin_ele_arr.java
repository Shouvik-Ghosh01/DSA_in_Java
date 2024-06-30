public class arraymin_ele_arr {
    public static void main(String[] args) {
        int[] arr={3,5,7,8,1,3,9,1,6,3,22,55,23};
        System.out.println("Minimum element in the array is : "+linearSearch(arr));
    }
    
    static int linearSearch(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }      
        }
        return min;
    }
}
