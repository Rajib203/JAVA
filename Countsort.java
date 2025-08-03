public class Countsort{
    public static void Csort(int arr[])
    { 
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);// for finding the original value
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;// for iterate in original array count the double element
        }
        // for sorting the element by looping this is sort array
        int j=0;
        for(int i=0;i<count.length;i++)
        {   while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
           }
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<=arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,3,4,5,6,1,1};
        Csort(arr);
        printArray(arr);
    }
}