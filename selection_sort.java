public class selection_sort {
    public static void sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={2,6,8,9,5};
       
        
        sort(arr);
        printArray(arr);
    }
   
}

