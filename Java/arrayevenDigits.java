public class arrayevenDigits {
    public static void main(String[] args) {
        int[] arr={12,34,567,789,3455,23,556,21,234,56789};
        int total=even(arr);
        System.out.println("The sum of all the numbers with even digits is : "+total);
    }
    
    static int even(int[] arr)
    {
        int count=0;
        for(int num: arr)
        {
            if(check(num)==true)
            {
                count++;
            }
        }
        return count;
    }

    static boolean check(int num)
    {
        int countdigit=0;
        while(num>0)
        {
            countdigit++;
            num= num/10;
        }
        if(countdigit%2==0)
        {
            return true;
        }
        return false;
    }

}
