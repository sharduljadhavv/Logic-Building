public class reversestring {
    public static void main(String [] args)
    {
        String str1="abcd";
        int leng=str1.length();
        String str2="";
        for(int i=leng-1;i>=0;i--)
        {
            str2=str2+ str1.charAt(i);

        }
        System.out.print(str2);
    }
    
}
