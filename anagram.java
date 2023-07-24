import java.util.Arrays;

public class anagram {
    public static void main(String [] args)
    {
        String str1="listen";
        String str2="silent";
        char st1[] =str1.toCharArray();
        char st2[] =str2.toCharArray();
        
        Arrays.sort(st1);
        Arrays.sort(st2);
        boolean result = Arrays.equals(st1,st2);


        if(result==true)
        {
            System.out.println("strings are anagram");
        }
        else{
            System.out.println("strings arent anagram");
        }


    }
    
}
