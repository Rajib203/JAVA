public class BubbleSort{
    public static void Bubblesorted(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {   int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Bubblesorted(arr);
        printArray(arr);
    }

}
//By Tuf
// import java.util.* ;
// import java.io.*; 

// public class Solution {
    
//     public static void bubbleSort(int[] arr, int n) {   
//         // Write your code here.
//         for(int i=n-1;i>=0;i--)
//         {
//             for(int j=0;j<=i-1;j++)
//             {
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }

//             }
//         }
//         System.out.println("after sort.");
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
            
//         }


//     }
//     public static void main(String[] args)
//     {
//         int arr[]={2,4,5,6,3};
//         int n=arr.length;
//         System.out.println("Before using bubblesort");
//         for(int i=0;i<=n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         bubbleSort(arr, n);
//     }

// }
