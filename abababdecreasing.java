public class abababdecreasing {
    public static void main(String [] args)
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=3;k>=i;k--)
            {
                System.out.print("ab");
            }
            for(int l=1;l>=i;l--)
            {
                System.out.print("ab");
            }
            System.out.println();
        }
    }
    
}
