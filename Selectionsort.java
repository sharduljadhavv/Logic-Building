/*public class Selectionsort {
    public static void main(String[] args) 
    {
        int arr[]={7,8,10,3,2,1,6,9,33,67,8,90};
        int n = arr.length;
        System.out.println("unsorted array:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + ",");

       for(int i=0;i<n-1;i++)
       {
        int min = i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
            if(min !=i)
            {
                int temp = arr[i];
                arr[i]= arr[min];
                arr[min]=temp;

            }
       }
       System.out.println("sorted array:");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + ",");
        
    }
}*/
public class Selectionsort{
    public static void main(String [] args){
        int arr[]={13,5,6,7,8,88,3,23,6,0,9,121,5,4,33,3,24,6,75,6,3,5,7};
        int n= arr.length;
        System.out.print("Unsorted Array:");
        for(int i=0; i<n;i++)
        System.out.print(arr[i] + ",");

        //selection sort
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min= j;
                }
                if(min != i)
                {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;

                }
            }
    
        }
        System.out.print("Sorted Array:");
        for(int i=0; i<n;i++)
        System.out.print(arr[i] + ",");

    }

}