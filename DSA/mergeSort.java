import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={8,4,7,1,3,0,89,43,23};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


    static void merge(int[] arr,int si,int mid,int ei)
    {
        int[] merged=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1 <= mid && idx2 <= ei)
        {
            if(arr[idx1]<=arr[idx2])
            {
                merged[x]=arr[idx1];
                idx1++;
                x++;
            }
            else{
                merged[x]=arr[idx2];
                idx2++;
                x++;
            }
        }

        while(idx1<=mid)
        {
            merged[x]=arr[idx1];
            idx1++;
            x++;
        }

        while(idx2<=ei)
        {
            merged[x]=arr[idx2];
            idx2++;
            x++;
        }

      for( int i=0, j=si;i< merged.length;i++,j++)
      {
        arr[j]=merged[i];
      }
    }

    static void sort(int[] arr,int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        sort(arr,si,mid);
        sort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
}
