public class binarysearch {
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int item=9;
        int li=0,hi=arr.length-1;
        int mi=(li+hi)/2;
        while(li<=hi)
        {
            if(arr[mi]==item)
            {
                System.out.print("item is at"+ mi +"index position");
                break;
            }
            else if(arr[mi]<item)
            {
                li=mi+1;
            }
            else
            {
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
       


    }
    
}
