public class Merge_sort {
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){//this part it recursion part 
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;//left part
        int j=mid+1;//right part
        int k=0;//temp arr
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        //for copy in k array
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }


    }
    public static void main(String[] args) {
        int arr[]={7,8,5,4,3,1,0};
        mergesort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
