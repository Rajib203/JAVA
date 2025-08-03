package Recursion;

public class Last_occurance {
    public static int lastoccurance(int arr[],int key,int i){
        if(i==arr.length)
        {
            return -1;
        }
        int isFound=lastoccurance(arr, key, i+1);//go forward first
        if(isFound==-1 && arr[i]==key)
        {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,5,4};
        System.out.println(lastoccurance(arr, 4, 0));
    }
}
