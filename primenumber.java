import java.util.Scanner;

/*public class primenumber {
    public static void main(String[] args)
    {
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=0;
        for(int i=2;i<num-1;i++)
        {
            if(num%i==0)
            {
            temp=temp+1;
            }
        }
        if(temp>0)
        {
            System.out.println("The number is not a prime number");
        }
        else{
            System.out.println("The number is a prime number");
        }

    }
    
}*/
public class primenumber{
    public static void main(String []args)
    {
        int temp=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    temp=temp+1;
                }
            }
            if(temp==0)
            {
                System.out.println(+i);
            }
            else{
                temp=0;
            }
        }
    }
}
