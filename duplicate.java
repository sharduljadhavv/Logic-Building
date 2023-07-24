public class duplicate
{
    public static void main(String [] args)
    {
        String str1="aabbccddeeeefgghhhi";
        myCode(str1);
    }
    public static void myCode(String str1)
    {
        String str2 = "";
        int n = str1.length();
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<i;j++)
            {
                if(str1.charAt(i)==str1.charAt(j))
                {
                    count++;
                }
            }
            if(count==0)
            str2= str2 + str1.charAt(i);
        }
        System.out.println(str2);
    }
}