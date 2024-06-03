public class stringSearch {
    public static void main(String[] args) {
        String str="Shouvik Ghosh";
        char target ='G';
        System.out.println(search(str,target));
    }
    //Function to search for a character
    static int search(String str,char target)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(target==str.charAt(i)){
                return i;
            }

        } 
        return -1;
    }
}
