import java.util.Scanner;
public class SumFactors{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("the sum is:" + sum);
    }
}