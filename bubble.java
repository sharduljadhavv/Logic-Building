/*public class bubble {
     public static void main(String[] args) {
        int arr[]={1,2,34,5,66,5,3,5,4,7,99,33,4,4,5,4,3,2,1,3,4,5,6,4,77,555,8,8};
        int n=arr.length;
        System.out.print("unsorted array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + ",");
            
        //bubble sort
        for (int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                 int temp = arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;   
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + ",");

        
    }
}*/
public class bubble{
    public static void main(String[] args){
        int arr[]={1,2,3,4,0,5,6,7,8,9,10};
        int n= arr.length;
        System.out.print("Unsorted Array:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + ",");

        //bubble
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.print("Sorted Array:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + ",");

    }
}