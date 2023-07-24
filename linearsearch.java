public class linearsearch {
    public static void main(String [] args)
    {
        int arr[]={2,4,5,7,9,1,10};
        int item=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                System.out.println("element present at"+ i+"index position");
            }
        }
    }
    
}
