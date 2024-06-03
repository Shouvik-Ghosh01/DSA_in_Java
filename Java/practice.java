
public class practice{

public static void main(String[] args) {
    int[] arr={23,456,67,7,1234,556,8903};
    int output=count_digit(arr);
    System.out.println("Total number of even digit numbers are:"+output);
    
}


static int count_digit(int[] arr)
{
   
    int even_count=0;

    for(int i=0;i<arr.length;i++)
    {
        int num=arr[i];
        int count=0;
        while(num!=0)
        {
            count=count+1;
            num=num/10;
        }
        
        if(count%2==0)
        {
            even_count++;
        }
       
    }
    return even_count;
}
}