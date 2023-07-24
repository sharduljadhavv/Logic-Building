public class removespecificchararray {
    public static void main(String [] args)
    { 
        int arr[]={1,2,3,4,55,5,6,7,8,9,10};
        int rem=55;
        myCode(arr,rem);
    }
    public static void myCode(int arr[],int rem)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int count =0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==rem)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.print(arr[i] + ",");
            }
        }
        

    }
    
}
