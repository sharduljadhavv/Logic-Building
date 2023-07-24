public class Onethreefiveseventb {
    public static void main(String [] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print("*");
            }
            
            
            System.out.println();
        }
        for(int m=1;m<=3;m++)
        {
            for(int n=1;n<=m;n++)
            {
                System.out.print(" ");
            }
            for(int o=3;o>=m;o--)
            {
                System.out.print("*");
            }
            for(int p=2;p>=m;p--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
