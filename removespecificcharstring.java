public class removespecificcharstring {
    public static void main(String [] args)
    {
        String str1="a#bc#d#e##g#";
        char hash = '#';
        myCode(str1,hash);
        
    }
    public static void myCode(String str1, char hash )
    {
        String str2="" ;
        int n=str1.length();
        for(int i=0;i<n;i++)
        {
            
                if(str1.charAt(i)!=hash)
                {
                    str2=str2+str1.charAt(i);     
                }    
        }
         System.out.println(str2);
    }

}
