import java.util.ArrayList;
import java.util.Arrays;

public class amazonQ2 {
      public static void main(String[] args) {
        int[] arr = {1, 3, 2, 0,5,7,7};
        cyclic(arr);
        System.out.println(Arrays.toString(arr)); 
        ArrayList<Integer> sol=result(arr); 
        System.out.println("The missing value is:"+sol); 
          
    }


    static void cyclic(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int correctIndex=arr[i];
            if(arr[i]==arr.length)
            {
                continue;
            }
            else if(arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
        }
    }
    static void swap(int[] arr,int max,int last)
    {
        int temp;
        temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    static  ArrayList<Integer> result(int[] arr)
    {
        ArrayList<Integer> ans=new ArrayList<>(); 

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                ans.add(i);               
            }
        }
      
        return ans;
    }    
}