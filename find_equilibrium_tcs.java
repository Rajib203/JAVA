import java.util.*;
public class find_equilibrium_tcs {
    public static int main(int[] arr){
        int totalSum=0;
        for(int num : arr){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum=totalSum-leftSum-arr[i];
            if(leftSum==totalSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The equilibrium index is "+find_equilibrium_tcs.main(arr));
    }
}
