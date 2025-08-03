package Recursion;

public class First_occurance {
    public static int firstoccurance(int arr[],int key,int i){
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstoccurance(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,4};
        System.out.println(firstoccurance(arr, 5, 0));
    }
}
