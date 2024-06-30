public class arrayWealth {
    public static void main(String[] args) {
        int[][] customer={{1,2,4},{2,3,4},{1,3},{6,7,8,9}};
        int result=wealth(customer);
        System.out.println("The maximum wealth is "+result);
    }

    static int wealth(int[][] arr)
    {
       
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum=sum+arr[i][j];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        
        return ans;
    }
}
