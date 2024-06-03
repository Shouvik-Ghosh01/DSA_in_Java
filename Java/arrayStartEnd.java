public class arrayStartEnd {
    public static void main(String[] args) {
        int[] arr={1,2,5,5,5,5,7,7,7,7,9,9,9,9,10};
        int target=9;
        int[] newar={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        newar[0]=start;
        newar[1]=end;
        System.out.println("["+newar[0]+","+newar[1]+"]");
    }

    static int search(int[] arr,int target,boolean index)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(index)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
          
            }
        }
        return ans;
    }
}

    

